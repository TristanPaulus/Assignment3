package com.cput.tristan;

import java.util.ArrayList;
import java.util.List;

/**
 * N.B!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *
 * Student class uses Lists to demonstrate that a student can do a subject more than once
 * should he or she fail it
 */
public class Student implements MyInterface {

    private String name;
    private String surname;
    private String studentNumber;
    private int age;
    private int noOfSubjects;

    private List<Subject> subjectHistory = new ArrayList<Subject>();

    Student()
    {

    }

    Student(String name, String surname, int age, String studentNumber)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.studentNumber = studentNumber;
        this.noOfSubjects = 0;
    }

    public String greet() {
        return MyInterface.greeting;
    }

    public String talk() {
        return MyInterface.conversation;
    }

    public void addSubject(Subject s)
    {
        subjectHistory.add(s);
        noOfSubjects++;
    }

    public String giveDetails()
    {
        String subjects = "";

        for(int i = 0; i<subjectHistory.size(); i++)
        {
            subjects = subjects + subjectHistory.get(i).getSubName() +"\n";
        }

        return "My name is " + name + " " + surname + "\nI am " + age + " years old\n\n" + "Thus far I have attempted the following subjects:\n" + subjects;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String toString() {
        return (name + " " + surname);
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }
}
