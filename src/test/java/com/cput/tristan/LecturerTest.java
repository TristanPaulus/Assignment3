package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/26.
 */
public class LecturerTest {

    Lecturer teacher;
    Subject pm;


    @Before
    public void setUp()
    {
        teacher = new Lecturer("Leopoldt Small");
        pm  = new Subject("Project management", "PM001", 1.25);

    }

    @Test
    public void testGreet()
    {
        assertEquals("Hello", teacher.greet());
    }

    @Test
    public void testTalk()
    {
        assertEquals("Nice weather we're having", teacher.talk());
    }

    @Test
    public void testAddSubjects()
    {
        teacher.addSubjects(pm);

        assertEquals(1, teacher.getNoOfSubjects());

    }

    @Test
    public void testGiveDetails()
    {
        teacher.addSubjects(pm);

        assertEquals("I teach:\nProject management", teacher.giveDetails());
    }


}