package com.cput.tristan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/03/26.
 */
public class ClassList {

    private String className;
    private int noOfStudents;

    private Map studentMap = new HashMap();

    ClassList()
    {

    }

    ClassList(String className)
    {
        this.className = className;
        noOfStudents = 0;
    }

    public void addStudent(Student s)
    {
        studentMap.put(s.getStudentNumber(), s);
        noOfStudents++;
    }

    public Object getStudent(String key)
    {
        return studentMap.get(key);
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }
}
