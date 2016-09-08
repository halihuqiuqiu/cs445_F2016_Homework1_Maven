package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Unit Test for Class Ant
 * Created by YongYang on 9/6/16.
 */
public class AntTest {
    /** Instantiation of Ant to test*/
    private Ant ant = new Ant("antNum1");

    /**
     * Test method for {@link Ant#move()}
     * @throws Exception
     */
    @Test
    public void move() throws Exception {
        ByteArrayOutputStream outcontent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outcontent));
        ant.move();
        assertEquals("antNum1 Ant is crawling around.\n", outcontent.toString());

    }

}