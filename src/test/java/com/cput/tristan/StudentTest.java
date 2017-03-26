package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/26.
 */
public class StudentTest {

    Student tristan;
    Subject cm;
    Subject pm;

    @Before
    public void setUp()
    {
        tristan = new Student("Tristan", "Paulus",23, "213142155");
        cm = new Subject("Communications", "CM001", 0.125);
        pm = new Subject("Project Management", "PM001", 0.125);
    }

    @Test
    public void testGreet() throws Exception {
        assertEquals("Hello", tristan.greet());
    }

    @Test
    public void testTalk() throws Exception {
        assertEquals("Nice weather we're having", tristan.talk());
    }

    @Test
    public void testAddSubject() throws Exception {
        tristan.addSubject(cm);
        tristan.addSubject(pm);

        assertEquals(2, tristan.getNoOfSubjects());
    }

    @Test
    public void giveDetails() throws Exception {
        String details = "My name is Tristan Paulus\nI am 23 years old\n\nThus far I have attempted the following subjects:\nCommunications\nProject Management\n";
        tristan.addSubject(cm);
        tristan.addSubject(pm);

        assertEquals(details, tristan.giveDetails());
    }

    @Test
    public void getStudentNumber() throws Exception {
        assertEquals("213142155", tristan.getStudentNumber());
    }

}