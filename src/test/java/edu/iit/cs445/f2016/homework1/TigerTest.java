package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


/**
 * Unit test for Class Tiger
 * Created by YongYang on 9/6/16.
 */
public class TigerTest {
    /** Instantiation of Tiger for test*/
    private Tiger tiger = new Tiger("tigerNum1");

    /**
     * Test method for {@link Tiger#move()}
     * @throws Exception
     */
    @Test
    public void move() throws Exception {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        tiger.move();
        assertEquals("tigerNum1 Tiger has just pounced.\n", outContent.toString());
    }

}