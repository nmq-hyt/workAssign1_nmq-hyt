package org.nmqhyt;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getUsername() {
        Student testStudent = new Student("Joanna Smalls", new DateTime(1995,10,5,2,32),321,20,"Chemistry", "4th", new ArrayList<Module>());
        System.out.println(testStudent.getUsername());
        assert(testStudent.getUsername().equals("JoannaSmalls20"));
    }
}