package com.example.testexamples.stubs;

import java.sql.SQLException;

public class ConnectionTimedOutStudentDAOStub implements StudentDAO {
    public String create(String name, String className)
            throws SQLException {
        throw new SQLException("DB connection timed out");
    }
}
