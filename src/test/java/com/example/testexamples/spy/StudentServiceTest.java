package com.example.testexamples.spy;

import com.example.testexamples.dummy.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    StudentService service = new StudentService();
    StudentServiceSpy spy = new StudentServiceSpy();

    @Test
    public void enrollsStudents() throws Exception {
        //create student objects
        Student bob = new Student("001", "Robert Anthony");
        Student roy = new Student("002", "Roy Noon");
        //set spy
        service.setSpy(spy);

        //enroll Bob and Roy
        service.enrollToCourse("english", bob);
        service.enrollToCourse("history", roy);
        //assert that the method was invoked twice
        assertEquals(2, spy.invocation("enrollToCourse"));

        //get the method arguments for the first call
        List<Object> methodArguments = spy.arguments
                ("enrollToCourse", 1).getParams();

        //get the method arguments for the 2nd call
        List<Object> methodArguments2 = spy.arguments
                ("enrollToCourse", 2).getParams();

        //verify that Bob was enrolled to English first
        assertEquals("english", methodArguments.get(0));
        assertEquals(bob, methodArguments.get(1));

        //verify that Roy was enrolled to history
        assertEquals("history", methodArguments2.get(0));
        assertEquals(roy, methodArguments2.get(1));

    }
}