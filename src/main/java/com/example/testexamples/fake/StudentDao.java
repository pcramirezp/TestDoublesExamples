package com.example.testexamples.fake;

import com.example.testexamples.dummy.Student;

import java.util.List;

public interface StudentDao {
    public void batchUpdate(List<Student> students);
}
