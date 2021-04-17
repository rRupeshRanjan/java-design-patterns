package com.java.design.patterns.creational;

import com.java.design.patterns.creational.builder.Student;
import com.java.design.patterns.creational.builder.StudentBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentBuilderTest {

    @Test
    void shouldCreateStudentWithBuilder() {
        StudentBuilder sb = new StudentBuilder();
        Student student = sb.id(1).firstName("ram").lastName("kumar").build();

        assertEquals(1, student.getId());
        assertEquals("ram", student.getFirstName());
        assertEquals("kumar", student.getLastName());
    }
}
