package org.tripsnek.tmf.json;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.core.CoreFactory;
import model.core.Foo;

public class TJsonTest {

    @Test
    void sampleTest() {

        Foo f = CoreFactory.eINSTANCE.createFoo();
        f.setName("test");
        // Arrange
        // Assert
        assertEquals("test", f.getName(), "dumb test");
    }
}    