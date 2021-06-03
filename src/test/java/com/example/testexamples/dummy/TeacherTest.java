package com.example.testexamples.dummy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    @Test
    public void whenMarksAbove75ReturnsVeryGood() {
        DummyStudent dummyStudent = new  DummyStudent();

        Marks inEnglish = new Marks(dummyStudent, "English002", new BigDecimal("81.00"));

        Marks inMath = new Marks(dummyStudent, "Math005", new BigDecimal("97.00"));

        Marks inHistory = new Marks(dummyStudent, "History007", new BigDecimal("79.00"));
        List<Marks> marks = Arrays.asList(inHistory, inMath, inEnglish);

        Grades grade = new Teacher().generateGrade(marks);
        assertEquals(Grades.VeryGood, grade);
    }
}