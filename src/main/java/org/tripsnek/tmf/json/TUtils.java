package org.tripsnek.tmf.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Various utilities for interacting with TMF-modeled data objects, some
 * of which are relied upon by core TMF components (e.g. TJson) and generated
 * source code.
 */
public class TUtils {
    
    // All primitive EDataTypes supported by TMF
    public static final List<String> PRIMITIVES = Arrays.asList(
        "EString", "EBoolean", "EDouble", "EDoubleObject", 
        "EFloat", "EFloatObject", "EInt", "EIntegerObject", "EDate"
    );
    
    private static final SimpleDateFormat ISO_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    
    static {
        ISO_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /**
     * Ensures all objects have IDs.
     * @param obj
     */
    public static void generateIdsForAllContained(EObject obj) {
        for (EObject e : obj.eAllContents()) {
            genIdIfNotExists(e);
        }
    }

    /**
     * Sets an ID for the given object on its ID EAttribute. If
     * an ID is already specified, does nothing.
     *
     * @param obj
     */
    public static void genIdIfNotExists(EObject obj) {
        if (obj != null && obj.eClass().getEIDAttribute() != null && getFullId(obj) == null) {
            obj.eSet(obj.eClass().getEIDAttribute(), UUID.randomUUID().toString());
        }
    }

    /**
     * If an ID is specified on the object, returns that ID value. If not, a
     * new ID is assigned and that ID returned.
     *
     * @param obj
     */
    public static String getOrCreateIdForObject(EObject obj) {
        genIdIfNotExists(obj);
        return getFullId(obj);
    }
    
    /**
     * Gets the full ID for an object (equivalent to TypeScript's fullId())
     */
    public static String getFullId(EObject obj) {
        if (obj == null || obj.eClass().getEIDAttribute() == null) {
            return null;
        }
        Object id = obj.eGet(obj.eClass().getEIDAttribute());
        if (id == null) {
            return null;
        }
        return obj.eClass().getName() + "_" + id.toString();
    }

    /**
     * Gets the TypeScript name for a given EClassifier, including
     * translation of primitive EDataType names (e.g. EBoolean -> boolean).
     * @param type
     */
    public static String getTypescriptName(EClassifier type) {
        if (type == null) return "null";
        String typeStr = type.getName();
        if (!(type instanceof EEnumImpl) && type instanceof EDataTypeImpl) {
            typeStr = toTypeScriptPrimitive(type);
        }
        return typeStr;
    }

    /**
     * Gets the TypeScript primitive type for a given TMF EClassifier that represents a
     * primitive type.
     * @param classifier
     */
    public static String toTypeScriptPrimitive(EClassifier classifier) {
        if (classifier == null || classifier.getName() == null) return "any";
        
        switch (classifier.getName().toLowerCase()) {
            case "estring":
                return "string";
            case "eboolean":
                return "boolean";
            case "edouble":
            case "edoubleobject":
            case "efloat":
            case "efloatobject":
            case "eint":
            case "eintegerobject":
                return "number";
            case "edate":
                return "Date";
            case "earray":
                return "[]";
            default:
                return "any";
        }
    }

    public static EStructuralFeature lookupNamedField(EObject object, String fieldName) {
        EClass curClass = object.eClass();
        EStructuralFeature field = curClass.getEStructuralFeature(fieldName);
        
        if (field == null) {
            System.out.println(curClass.getName() + " has no field named " + fieldName);
            return null;
        }
        return field;
    }

    public static Object getNamedFieldValue(EObject object, String fieldName) {
        EStructuralFeature field = lookupNamedField(object, fieldName);
        if (field != null) {
            return object.eGet(field);
        }
        return null;
    }

    public static void setNamedFieldValue(EObject object, String fieldName, Object newValue) {
        EStructuralFeature field = lookupNamedField(object, fieldName);
        if (field != null) {
            object.eSet(field, newValue);
        }
    }

    /**
     * Parses a value for an EAttribute from its JSON representation.
     *
     * @param attr
     * @param stringVal
     */
    public static Object parseAttrValFromString(EAttribute attr, Object stringVal) {
        return parseValueFromString(attr.getEType(), String.valueOf(stringVal));
    }

    public static Object parseValueFromString(EClassifier attrType, String stringVal) {
        // If an empty string was set for the field, just return null
        if (stringVal == null || 
            (stringVal.trim().isEmpty() && attrType != EcorePackage.Literals.ESTRING)) {
            return null;
        }

        if (attrType == EcorePackage.Literals.ESTRING) {
            return stringVal;
        } else if (attrType == EcorePackage.Literals.EDOUBLE ||
                   attrType == EcorePackage.Literals.EDOUBLE_OBJECT) {
            return Double.parseDouble(stringVal);
        } else if (attrType == EcorePackage.Literals.EFLOAT ||
                   attrType == EcorePackage.Literals.EFLOAT_OBJECT) {
            return Float.parseFloat(stringVal);
        } else if (attrType == EcorePackage.Literals.EBOOLEAN ||
                   attrType == EcorePackage.Literals.EBOOLEAN_OBJECT) {
            return Boolean.parseBoolean(stringVal);
        } else if (attrType == EcorePackage.Literals.ESHORT ||
                   attrType == EcorePackage.Literals.ESHORT_OBJECT) {
            return Short.parseShort(stringVal);
        } else if (attrType == EcorePackage.Literals.EINT ||
                   attrType == EcorePackage.Literals.EINTEGER_OBJECT) {
            return Integer.parseInt(stringVal);
        } else if (attrType == EcorePackage.Literals.ELONG ||
                   attrType == EcorePackage.Literals.ELONG_OBJECT) {
            return Long.parseLong(stringVal);
        } else if (attrType == EcorePackage.Literals.EDATE) {
            try {
                return ISO_DATE_FORMAT.parse(stringVal);
            } catch (ParseException e) {
                try {
                    return new Date(Long.parseLong(stringVal));
                } catch (NumberFormatException ne) {
                    System.err.println("Could not parse date: " + stringVal);
                    return null;
                }
            }
        } else if (attrType instanceof EEnumImpl) {
            EEnum eenum = (EEnum) attrType;
            EEnumLiteral literal = eenum.getEEnumLiteral(stringVal);
            if (literal != null) {
                return literal.getLiteral();
            } else {
                System.err.println("Could not parse literal value " + stringVal + " for " + eenum.getName());
            }
        }
        return null;
    }

    /**
     * Creates a deep copy of a Root and its containment hierarchy, with optional
     * lists for specifying specific EReferences to traverse or prune during the copy. New
     * IDs will be assigned to all copied entities. Internal references will be preserved where possible.
     *
     * @param toClone - root of container containment hierarchy to copy
     * @param prune - EReferences not to traverse during copy. If specified, these
     *                references will not be traversed during copy
     * @param traverse - EReferences to traverse during copy. If specified, no EReference
     *                   will be traversed unless it is in this list.
     * @param target - Allows specification of an entity into which to copy data, which does not have
     *                 to be of the same type as the copied entity (non-overlapping structure will be ignored).
     * @returns the copy
     */
    @SuppressWarnings("unchecked")
    public static <T extends EObject> T clone(T toClone, List<EReference> prune, List<EReference> traverse, T target, Map<EObject, EObject> oldToNewEntities) {
        // Create new instance
        T newContainer = target;
        if (newContainer == null) {
            newContainer = (T) toClone.eClass().getEPackage().getEFactoryInstance().create(toClone.eClass());
        }

        // Map of old entities to new entities that will be filled in during the duplication
        Map<EObject, EObject> oldToNew = oldToNewEntities != null ? oldToNewEntities : new HashMap<>();

        // Recursive duplication of containment hierarchy
        cloneInto(toClone, newContainer, prune != null ? prune : new ArrayList<>(), 
                 traverse != null ? traverse : new ArrayList<>(), oldToNew);

        // Re-establish container internal references for all entities in the
        // container, including the container root itself
        List<EObject> allOldEntities = new ArrayList<>();
        for (EObject obj : toClone.eAllContents()) {
            allOldEntities.add(obj);
        }
        allOldEntities.add(toClone);
        
        for (EObject oldEntity : allOldEntities) {
            EObject newEntity = oldToNew.get(oldEntity);
            if (newEntity != null) {
                for (EReference eref : newEntity.eClass().getEAllReferences()) {
                    // Only look at container internal references
                    if (!eref.isContainment() && !eref.isTransient()) {
                        Object oldRefVal = oldEntity.eGet(eref);
                        if (oldRefVal != null) {
                            // Handle many-valued references
                            if (eref.isMany()) {
                                @SuppressWarnings("unchecked")
                                EList<EObject> newRefList = (EList<EObject>) newEntity.eGet(eref);
                                if (newRefList != null) {
                                    @SuppressWarnings("unchecked")
                                    EList<EObject> oldRefList = (EList<EObject>) oldRefVal;
                                    for (EObject oldRef : oldRefList) {
                                        EObject newRef = oldToNew.get(oldRef);
                                        if (newRef != null) {
                                            newRefList.add(newRef);
                                        } else if (oldRef != null) {
                                            newRefList.add(oldRef);
                                        }
                                    }
                                }
                            }
                            // Handle single-valued references
                            else {
                                EObject newVal = oldToNew.get(oldRefVal);
                                if (newVal != null) {
                                    newEntity.eSet(eref, newVal);
                                } else {
                                    newEntity.eSet(eref, oldRefVal);
                                }
                            }
                        }
                    }
                }
            }
        }
        return newContainer;
    }

    public static <T extends EObject> T clone(T toClone) {
        return clone(toClone, null, null, null, null);
    }

    @SuppressWarnings("unchecked")
    private static <T extends EObject> void cloneInto(T copyFrom, T copyInto, List<EReference> pruneOnlyTheseReferences, 
                                                     List<EReference> traverseOnlyTheseReferences, Map<EObject, EObject> oldToNew) {
        // Copy all attributes
        for (EAttribute attr : copyInto.eClass().getEAllAttributes()) {
            if (!attr.isVolatile()) {
                copyInto.eSet(attr, copyFrom.eGet(attr));
            }
        }

        // Assign new ID to entity
        if (copyInto.eClass().getEIDAttribute() != null) {
            copyInto.eSet(copyInto.eClass().getEIDAttribute(), UUID.randomUUID().toString());
        }

        // Register old to new entity in Map, if specified
        if (oldToNew != null) {
            oldToNew.put(copyFrom, copyInto);
        }

        // Recurse containments
        for (EReference ref : copyInto.eClass().getEAllReferences()) {
            // Determine if reference should be traversed
            boolean traverse = true;

            // Do not traverse pruned references
            if (traverse && pruneOnlyTheseReferences != null) {
                for (EReference toPrune : pruneOnlyTheseReferences) {
                    if (toPrune == ref) {
                        traverse = false;
                        break;
                    }
                }
            }
            
            // Do not traverse references not in the traverse list (if it is specified)
            if (traverse && traverseOnlyTheseReferences != null && !traverseOnlyTheseReferences.isEmpty()) {
                traverse = false;
                for (EReference toTraverse : traverseOnlyTheseReferences) {
                    if (toTraverse == ref) {
                        traverse = true;
                        break;
                    }
                }
            }

            // Recursively copy the containment
            if (traverse) {
                if (ref.isContainment()) {
                    // Many-valued containment
                    if (ref.isMany()) {
                        EList<EObject> list = (EList<EObject>) copyInto.eGet(ref);
                        EList<EObject> fromList = (EList<EObject>) copyFrom.eGet(ref);
                        for (EObject toCopy : fromList) {
                            list.add(clone(toCopy, pruneOnlyTheseReferences, traverseOnlyTheseReferences, null, oldToNew));
                        }
                    }
                    // Single valued containment
                    else {
                        EObject toCopy = (EObject) copyFrom.eGet(ref);
                        if (toCopy != null) {
                            copyInto.eSet(ref, clone(toCopy, pruneOnlyTheseReferences, traverseOnlyTheseReferences, null, oldToNew));
                        }
                    }
                }
                // Simply assign non-containment references if they have no eopposite
                else if (ref.getEOpposite() == null && !ref.isContainer() && !ref.isVolatile()) {
                    if (ref.isMany()) {
                        EList<EObject> list = (EList<EObject>) copyInto.eGet(ref);
                        EList<EObject> fromList = (EList<EObject>) copyFrom.eGet(ref);
                        for (EObject member : fromList) {
                            list.add(member);
                        }
                    } else {
                        copyInto.eSet(ref, copyFrom.eGet(ref));
                    }
                }
            }
        }
    }

    public static <T extends EObject> T carbonCopy(T obj) {
        return TJson.makeEObject(TJson.makeJson(obj));
    }

    /**
     * Overwrites all attributes values, and replaces all containments with
     * carbon copies. Non-containment references are left alone.
     *
     * @param currentState
     * @param newState
     */
    @SuppressWarnings("unchecked")
    public static void shallowUpdate(EObject currentState, EObject newState) {
        // Copy all EAttributes at the root level
        for (EAttribute attr : newState.eClass().getEAllAttributes()) {
            if (!attr.isVolatile()) {
                currentState.eSet(attr, newState.eGet(attr));
            }
        }

        // Replace all contained instances
        for (EReference ref : newState.eClass().getEAllReferences()) {
            if (ref.isContainment()) {
                if (ref.isMany()) {
                    EList<EObject> currentContained = (EList<EObject>) currentState.eGet(ref);
                    currentContained.clear();
                    EList<EObject> newContainedList = (EList<EObject>) newState.eGet(ref);
                    for (EObject newContained : newContainedList) {
                        currentContained.add(carbonCopy(newContained));
                    }
                } else {
                    EObject newContained = (EObject) newState.eGet(ref);
                    if (newContained != null) {
                        currentState.eSet(ref, carbonCopy(newContained));
                    } else {
                        currentState.eSet(ref, null);
                    }
                }
            }
        }
    }

    /**
     * Returns the package and transitive closure of all contained subpackages.
     *
     * @param pkg
     * @returns
     */
    public static List<EPackage> allPackagesRecursive(EPackage pkg, List<EPackage> addTo) {
        List<EPackage> pkgs = addTo != null ? addTo : new ArrayList<>();
        pkgs.add(pkg);
        for (EPackage sp : pkg.getESubPackages()) {
            allPackagesRecursive(sp, pkgs);
        }
        return pkgs;
    }

    public static List<EPackage> allPackagesRecursive(EPackage pkg) {
        return allPackagesRecursive(pkg, null);
    }

    public static List<EClass> getRootEClasses(EPackage root) {
        if (root == null) return new ArrayList<>();

        List<EPackage> allPkgs = allPackagesRecursive(root);
        List<EClass> allClasses = new ArrayList<>();
        Set<EClass> containedClasses = new HashSet<>();

        // First, collect all non-abstract, non-interface classes
        for (EPackage ePackage : allPkgs) {
            for (EClassifier classifier : ePackage.getEClassifiers()) {
                if (classifier instanceof EClassImpl) {
                    EClass eClass = (EClass) classifier;
                    if (!eClass.isAbstract() && !eClass.isInterface()) {
                        allClasses.add(eClass);
                    }
                }
            }
        }

        // Then, find which classes are contained by others
        for (EClass eClass : allClasses) {
            for (EReference ref : eClass.getEAllReferences()) {
                if (ref.isContainment()) {
                    EClassifier targetType = ref.getEType();
                    if (targetType instanceof EClassImpl) {
                        EClass targetClass = (EClass) targetType;
                        containedClasses.add(targetClass);
                        // Also add all subtypes
                        for (EClass otherClass : allClasses) {
                            if (otherClass.getEAllSuperTypes().contains(targetClass)) {
                                containedClasses.add(otherClass);
                            }
                        }
                    }
                }
            }
        }

        // Return classes that are not contained by any other class
        List<EClass> result = new ArrayList<>();
        for (EClass c : allClasses) {
            if (!containedClasses.contains(c)) {
                result.add(c);
            }
        }
        Collections.reverse(result);
        return result;
    }
}