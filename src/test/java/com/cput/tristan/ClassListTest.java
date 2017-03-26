package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/26.
 */
public class ClassListTest {

    ClassList classroom;
    Student tristan;
    Student another;
    Object test;

    @Before
    public void setUp()
    {
        classroom = new ClassList("1A");
        tristan = new Student("Tristan", "Paulus", 23, "213142155");
        another = new Student("Max", "Payne", 20, "216283912");

    }

    @Test
    public void testAddStudent() throws Exception
    {
        classroom.addStudent(tristan);
        classroom.addStudent(another);
        assertEquals(2, classroom.getNoOfStudents());
    }

    @Test
    public void testGetStudent() throws Exception
    {
        classroom.addStudent(tristan);
        test = classroom.getStudent("213142155");

        assertEquals("Tristan Paulus", test.toString());
    }
}