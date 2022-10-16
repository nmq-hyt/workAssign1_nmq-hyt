package org.nmqhyt;

import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUsername() {
        Lecturer testLecturer = new Lecturer("John Smith",new DateTime(1978,5,4,12,30),123, new ArrayList<Module>(),44);
        System.out.println(testLecturer.getUsername());
        assert(testLecturer.getUsername().equals("JohnSmith44"));
    }
}