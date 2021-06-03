package com.example.testexamples.stubs;

import java.sql.SQLException;

public interface StudentDAO {
    public String create(String name, String className) throws SQLException;
}
