package com.example.testexamples.stubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsServiceTest {

    private StudentService studentService;
    @Test
    public void WhenConnectionTimesOutThenTheStudentIsNotSaved() {
        studentService = new StudentServiceImpl(new ConnectionTimedOutStudentDAOStub());
        String classNine = "IX";
        String johnSmith = "john Smith";
        CreateStudentResponse resp = studentService.create(johnSmith, classNine);
        assertFalse(resp.isSuccess());
    }

}