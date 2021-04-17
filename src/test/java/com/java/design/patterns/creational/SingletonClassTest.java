package com.java.design.patterns.creational;

import com.java.design.patterns.creational.singleton.SingletonClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonClassTest {

    @Test
    public void shouldCreateOnlyOneInstanceOfObject() {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.setId(1);
        singletonClass1.setName("ram");

        assertEquals("ram", singletonClass1.getName());
        assertEquals(1, singletonClass1.getId());

        SingletonClass singletonClass2 = SingletonClass.getInstance();
        singletonClass2.setName("shyam");

        assertEquals("shyam", singletonClass1.getName());
        assertEquals("shyam", singletonClass2.getName());
        assertEquals(1, singletonClass1.getId());
        assertEquals(1, singletonClass2.getId());
    }

    @Test
    public void shouldRetainSingletonAfterCloning() {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.setId(1);
        singletonClass1.setName("ram");

        assertEquals("ram", singletonClass1.getName());
        assertEquals(1, singletonClass1.getId());

        SingletonClass singletonClass2 = singletonClass1.clone();
        singletonClass2.setName("shyam");

        assertEquals("shyam", singletonClass1.getName());
        assertEquals("shyam", singletonClass2.getName());
        assertEquals(1, singletonClass1.getId());
        assertEquals(1, singletonClass2.getId());
    }
}
