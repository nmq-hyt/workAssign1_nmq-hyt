
package org.nmqhyt;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.lang.Integer;

public class Student {
    private String studentFullName;
    private DateTime dateOfBirth;
    private Integer id;
    private String course;
    private String year;
    private ArrayList<Module> registeredModules;
    private Integer age;

    public Student(String studentFullName, DateTime dateOfBirth, Integer id, Integer age, String course, String year, ArrayList<Module> registeredModules) {
        this.studentFullName = studentFullName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.age = 20;
        this.course = course;
        this.year = year;
        this.registeredModules = registeredModules;
    }

    public String getStudentFullName() {
        return this.studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public DateTime getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ArrayList<Module> getRegisteredModules() {
        return this.registeredModules;
    }

    public void setRegisteredModules(ArrayList<Module> registeredModules) {
        this.registeredModules = registeredModules;
    }

    public Integer getAge() {
        return age;
    }

    public String getUsername() {
        return getStudentFullName().replace(" ", "") + Integer.toString(getAge());
    }
    
}
