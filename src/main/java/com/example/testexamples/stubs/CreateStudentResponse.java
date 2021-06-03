package com.example.testexamples.stubs;

import com.example.testexamples.dummy.Student;

public class CreateStudentResponse {
    private final String errorMessage;
    private final Student student;

    public CreateStudentResponse(String errorMessage, Student student) {
        this.errorMessage = errorMessage;
        this.student = student;
    }
    public boolean isSuccess(){
        return null == errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public Student getStudent() {
        return student;
    }
}
