package com.example.testexamples.spy;

import com.example.testexamples.dummy.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private Map<String, List<Student>> studentCouseMap = new HashMap<>();

    private StudentServiceSpy spy;

    public void setSpy(StudentServiceSpy spy) {
        this.spy = spy;
    }

    public void enrollToCourse(String courseName, Student student) {
        MethodInvocation invocation = new MethodInvocation();
        invocation.addParam(courseName).addParam(student).setMethod("enrollToCourse");
        spy.registerCall(invocation);

        List<Student> list = studentCouseMap.get(courseName);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(student)) {
            list.add(student);
        }

        studentCouseMap.put(courseName, list);
    }
}
