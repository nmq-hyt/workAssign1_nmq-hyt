package org.nmqhyt;
import java.util.ArrayList;

public class Module {
    private String moduleName;
    private ArrayList<Student> listOfStudents;
    private ArrayList<String> listOfAssociatedCourses;
    private ArrayList<Lecturer> listOfLecturers;

    public Module(String moduleName, ArrayList<Student> listOfStudents, ArrayList<String> listOfAssociatedCourses, ArrayList<Lecturer> listOfLecturers) {
        this.moduleName = moduleName;
        this.listOfStudents = listOfStudents;
        this.listOfAssociatedCourses = listOfAssociatedCourses;
        this.listOfLecturers = listOfLecturers;
    }


    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ArrayList<Student> getListOfStudents() {
        return this.listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public ArrayList<String> getListOfAssociatedCourses() {
        return this.listOfAssociatedCourses;
    }

    public void setListOfAssociatedCourses(ArrayList<String> listOfAssociatedCourses) {
        this.listOfAssociatedCourses = listOfAssociatedCourses;
    }

    public ArrayList<Lecturer> getListOfLecturers() {
        return this.listOfLecturers;
    }

    public void setListOfLecturers(ArrayList<Lecturer> listOfLecturers) {
        this.listOfLecturers = listOfLecturers;
    }
    
}
