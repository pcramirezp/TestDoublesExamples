package com.example.testexamples.fake;

import com.example.testexamples.dummy.Student;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDaoTest {

    class TestableStudentDao extends StudentDaoImpl{
        int[] valuesToReturn;
        public int[] update(String sql, List<Map<String, Object>> params) {
            Integer count = sqlCount.get(sql);
            if(count == null){
                sqlCount.put(sql, params.size());
            }else{
                sqlCount.put(sql, count+params.size());
            }

            if (valuesToReturn != null) {
                return valuesToReturn;
            }


            return valuesToReturn;
        }
    }
    private TestableStudentDao dao;
    private Map<String, Integer> sqlCount = null;

    @Before
    public void setup() {
        dao = new TestableStudentDao();
        sqlCount = new HashMap<String, Integer>();
    }

    @Test(expected=IllegalStateException.class)
    public void whenRowCountDoesNotMatchThenRollbacksTransaction() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(null, "Gautam Kohli"));

        int[] expect_update_fails_count = {0};
        dao.valuesToReturn = expect_update_fails_count;
        dao.batchUpdate(students);
    }

    @Test
    public void whenNewStudentThenCreatesStudent(){
        List<Student>  students = new ArrayList<>();
        students.add(new Student(null, "Gautam Kohli"));

        int[] expect_update_success = {1};
        dao.valuesToReturn = expect_update_success;
        dao.batchUpdate(students);

        int actualInsertCount = sqlCount.get("insert");
        int expectedInsertCount = 1;
        assertEquals(expectedInsertCount, actualInsertCount);
    }
}