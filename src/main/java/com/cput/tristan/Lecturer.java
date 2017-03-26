package com.cput.tristan;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * N.B!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *
 * Lecturer class shows application of Sets using the Subject class as a type,
 * demonstrating that a lecturer cannot teach the same subject twice
 */
public class Lecturer implements MyInterface {

    private String name;
    int noOfSubjects;
    private Set<Subject> subjects = new HashSet<Subject>();

    Lecturer(String name)
    {
        this.name = name;
        this.noOfSubjects = 0;
    }

    public String greet()
    {
        return MyInterface.greeting;
    }

    public String talk()
    {
        return MyInterface.conversation;
    }

    public String giveDetails() {

        String subjectsTaught = "I teach:\n";

        Iterator<Subject> itr = subjects.iterator();

        while(itr.hasNext())
        {
            subjectsTaught += itr.next().getSubName();
        }

        return subjectsTaught;
    }

    public void addSubjects(Subject s)
    {
        subjects.add(s);
        noOfSubjects++;
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }
}
