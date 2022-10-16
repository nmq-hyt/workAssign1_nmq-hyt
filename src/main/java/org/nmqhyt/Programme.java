package org.nmqhyt;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Programme {
    private String courseName;
    private ArrayList<Student> listOfEnrolledStudents;
    private DateTime startDate;
    private DateTime endDate;

    public Programme(String courseName, ArrayList<Student> listOfEnrolledStudents, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.listOfEnrolledStudents = listOfEnrolledStudents;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getListOfEnrolledStudents() {
        return this.listOfEnrolledStudents;
    }

    public void setListOfEnrolledStudents(ArrayList<Student> listOfEnrolledStudents) {
        this.listOfEnrolledStudents = listOfEnrolledStudents;
    }

    public DateTime getStartDate() {
        return this.startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return this.endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    
}
