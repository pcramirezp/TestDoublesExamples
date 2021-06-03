package com.example.testexamples.dummy;

public class Student {

    private final String roleNumber;
    private final String name;

    public Student(String roleNumber, String name) {
        this.roleNumber = roleNumber;
        this.name = name;
    }

    public String getRoleNumber() {
        return roleNumber;
    }

    public String getName() {
        return name;
    }
}
