//N.B!!!!!!

//Main class demonstrates how classes and interfaces work together, functionality will be added later

package com.cput.tristan;


import java.util.ArrayList;
import java.util.Collection;

public class App
{

    public static void main( String[] args )
    {
        Subject pm  = new Subject("Project management", "PM001", 1.25);
        Subject sa  = new Subject("Systems Analysis", "SA001", 1.25);
        Subject ds  = new Subject("Dev. Software", "DS001", 1.25);
        Subject tp  = new Subject("Technical Programming", "TP001", 1.25);
        Subject ip = new Subject("Internet Programming", "IP001", 1.25);
        Subject cm  = new Subject("Communications", "CM001", 1.25);

        Student tristan = new Student("Tristan", "Paulus", 23, "213142155");
        tristan.addSubject(pm);
        tristan.addSubject(ip);
        tristan.addSubject(pm);
        tristan.addSubject(cm);

        Student jack = new Student("Jack", "Harper", 20, "213142156");
        jack.addSubject(sa);
        jack.addSubject(sa);
        jack.addSubject(ip);
        jack.addSubject(ds);

        ClassList classroom = new ClassList("1A");
        classroom.addStudent(tristan);
        classroom.addStudent(jack);

        Lecturer small = new Lecturer("Leopoldt Small");
        small.addSubjects(pm);
        small.addSubjects(cm);
        small.addSubjects(ip);
    }
}
