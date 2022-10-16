package org.nmqhyt;

import java.util.ArrayList;
import java.lang.Integer;
import org.joda.time.DateTime;
import org.nmqhyt.Module;

public class Lecturer {
    private String lecturerFullName;
    private DateTime dateOfBirth;
    private Integer id;
    private ArrayList<Module> teachingModules;
    private Integer age;


    public Lecturer(String lecturerFullName, DateTime dateOfBirth, Integer id, ArrayList<Module> teachingModules, Integer age) {
        this.lecturerFullName = lecturerFullName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.teachingModules = teachingModules;
        this.age = age;
    }

    public String getLecturerFullName() {
        return this.lecturerFullName;
    }

    public void setLecturerFullName(String lecturerFullName) {
        this.lecturerFullName = lecturerFullName;
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

    public ArrayList<Module> getTeachingModules() {
        return this.teachingModules;
    }

    public void setTeachingModules (ArrayList<Module> teachingModules) {
        this.teachingModules = teachingModules;
    }

    public Integer getAge() {
        return age;
    }

    public String getUsername() {
        return getLecturerFullName().replace(" ","") + Integer.toString(getAge());
    }


}
