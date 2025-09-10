# TMF Java

[![Maven Central](https://img.shields.io/maven-central/v/com.tripsnek/tmf-java.svg)](https://search.maven.org/artifact/com.tripsnek/tmf-java)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

TMF Java provides JSON serialization and deserialization capabilities for Eclipse Modeling Framework (EMF) EObjects, enabling seamless interoperability between Java backends and TypeScript frontends using the [TypeScript Modeling Framework (TMF)](https://www.npmjs.com/package/@tripsnek/tmf).

## Why TMF Java?

When building full-stack applications with shared data models, you often need:
- **Frontend**: TypeScript with TMF for rich, reflective modeling
- **Backend**: Java with EMF for robust server-side processing
- **Communication**: JSON serialization that preserves object relationships, IDs, and type information

TMF Java bridges this gap by providing `TJson` - a Java equivalent to TMF's TypeScript serialization that produces identical JSON format, enabling perfect round-trip compatibility between your Java backend and TypeScript frontend.

## Installation

**TODO: awaiting package publication**

Add TMF Java to your Maven project:

```xml
<dependency>
    <groupId>com.tripsnek</groupId>
    <artifactId>tmf-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or with Gradle:
```gradle
implementation 'com.tripsnek:tmf-java:1.0.0'
```

## Quick Start

### 1. Generate Your Model Code

Start with a shared `.ecore` model file:

**Frontend**: Generate TypeScript using TMF:
```bash
npx @tripsnek/tmf ./path/to/your/model.ecore
```

**Backend**: Generate Java using Eclipse EMF:
1. Create a `.genmodel` from your `.ecore` file
2. Right-click → "Generate Model Code"

### 2. Basic Usage

```java
import com.tripsnek.tmf.json.TJson;
import com.tripsnek.tmf.json.TUtils;
import com.mycompany.model.MyModelPackage;
import com.mycompany.model.Blog;
import com.mycompany.model.Post;
import com.mycompany.model.MyModelFactory;

// Initialize TMF Java with your model packages
TJson.setPackages(TUtils.allPackagesRecursive(MyModelPackage.eINSTANCE));

MyModelFactory factory = MyModelFactory.eINSTANCE;

// Create objects
Blog blog = factory.createBlog();
blog.setTitle("My Tech Blog");
blog.setId("blog_1");

Post post = factory.createPost();
post.setTitle("Introduction to TMF Java");
post.setContent("TMF Java enables seamless Java/TypeScript interop...");
blog.getPosts().add(post);

// Serialize to JSON (compatible with TypeScript TMF)
JsonNode json = TJson.makeJson(blog);
String jsonString = json.toString();

// Send to frontend, receive from frontend, etc.

// Deserialize from JSON
Blog deserializedBlog = TJson.makeEObject(json);
```

## Key Concepts

### Package Registration

Before using `TJson`, you must register your EMF packages:

```java
// Register a single package and all its subpackages
TJson.setPackages(TUtils.allPackagesRecursive(MyModelPackage.eINSTANCE));

// Or register multiple root packages
List<EPackage> packages = new ArrayList<>();
packages.addAll(TUtils.allPackagesRecursive(Package1.eINSTANCE));
packages.addAll(TUtils.allPackagesRecursive(Package2.eINSTANCE));
TJson.setPackages(packages);
```

### ID Attributes

TMF Java relies on EMF's ID attributes for object identification:

```java
// Automatic ID generation for objects without IDs (String UUIDs by default)
TUtils.genIdIfNotExists(myObject);

// Get the full ID (format: "ClassName_actualId")
String fullId = TUtils.getFullId(myObject);

// Ensure all contained objects have IDs
TUtils.generateIdsForAllContained(rootObject);
```

**Important**: Objects without ID attributes cannot be referenced across containment boundaries. Ensure your `.ecore` model marks appropriate attributes as `ID="true"`.

### Containment vs Cross-References

TMF Java preserves EMF's containment semantics:

- **Containment references** (`containment="true"`): Child objects are serialized inline
- **Cross-references**: Only object IDs are serialized; creates proxy objects on deserialization

```java
// Containment - post is serialized with blog
blog.getPosts().add(post);

// Cross-reference - only user ID is serialized
blog.setAuthor(externalUser); // Creates proxy on deserialization
```

## Common Patterns

### REST API Integration

```java
@RestController
public class BlogController {
    
    static {
        // Initialize TMF Java once at startup
        TJson.setPackages(TUtils.allPackagesRecursive(ModelPackage.eINSTANCE));
    }
    
    @PostMapping("/api/blogs")
    public ResponseEntity<String> createBlog(@RequestBody String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode json = mapper.readTree(jsonString);
            
            // Deserialize from frontend
            Blog blog = TJson.makeEObject(json);
            
            // Process with your business logic
            blogService.save(blog);
            
            // Return updated object
            JsonNode response = TJson.makeJson(blog);
            return ResponseEntity.ok(response.toString());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid JSON");
        }
    }
}
```

### Proxy Object Handling

*NOTE: TMF proxies are simpler than EMF's full resource-based proxy system - they contain just the object type and ID information needed for JSON serialization scenarios, without EMF's broader resource loading and URI resolution capabilities.*

```java
// External references create proxy objects
Blog blog = TJson.makeEObject(jsonFromFrontend);
User author = blog.getAuthor();

if (author.eIsProxy()) {
    // Load the actual object from your data store
    String authorId = author.getId();
    User actualAuthor = userService.findById(authorId);
    blog.setAuthor(actualAuthor);
}
```

### Array Serialization

```java
// Serialize arrays of root objects
List<Blog> blogs = blogService.findAll();
ArrayNode jsonArray = TJson.makeJsonArray(blogs);

// Deserialize arrays
List<Blog> deserializedBlogs = (List<Blog>) TJson.makeEObjectArray(jsonArray);
```

## Integration with TypeScript TMF

TMF Java produces JSON that's 100% compatible with TypeScript TMF:

**Java Backend**:
```java
JsonNode json = TJson.makeJson(blog);
// Send to frontend
```

**TypeScript Frontend**:
```typescript
import { TJson, BlogPackage } from '@myorg/model';

// Receive from backend
const blog = TJson.makeEObject(json) as Blog;
console.log(blog.getTitle()); // Works perfectly!
```

The same JSON format works in both directions, enabling seamless full-stack development with shared models.

## Error Handling

TMF Java provides helpful error messages:

```java
try {
    Blog blog = TJson.makeEObject(malformedJson);
} catch (RuntimeException e) {
    // "TJson: No packages registered..." 
    // "ERROR: No value for @type was specified..."
}
```

## Examples

Complete working examples are available in the [TMF Examples repository](https://github.com/tripsnek/tmf-examples), including full-stack applications demonstrating Java backend + TypeScript frontend integration.

## Dependencies

- Java 11 or higher
- Eclipse EMF 
- Jackson (for JSON processing)

## License

TMF Java is MIT licensed. See [LICENSE](LICENSE) for details.

## Related Projects

- **[TMF TypeScript](https://www.npmjs.com/package/@tripsnek/tmf)** - The TypeScript modeling framework
- **[TMF Ecore Editor](https://github.com/tripsnek/tmf-ecore-editor)** - VSCode extension for visual model editing
- **[TMF Examples](https://github.com/tripsnek/tmf-examples)** - Complete full-stack applications
