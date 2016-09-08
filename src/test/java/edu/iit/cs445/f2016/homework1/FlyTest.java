package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Unit test for Class Fly
 * Created by YongYang on 9/6/16.
 */
public class FlyTest {
    /** Instantiation of Fly to test*/
    private Fly fly = new Fly("flyNum1");

    /**
     * Test method for{@link Fly#eat(Thing)}
     * @throws Exception
     */
    @Test
    public void eatCreature() throws Exception {

        Bat bat= new Bat("batNum1");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        fly.eat(bat);
        assertEquals("flyNum1 Fly won't eat a batNum1 Bat.\n", outContent.toString());
    }

    /**
     * Test method for{@link Fly#eat(Thing)}
     * @throws Exception
     */
    @Test
    public void eatThingButNotCreature() throws Exception {

        Thing banana= new Thing("banana");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        fly.eat(banana);
        assertEquals("flyNum1 Fly has just eaten a banana.\n", outContent.toString());
    }

    /**
     * Test method for{@link Fly#move()}
     * @throws Exception
     */
    @Test
    public void move() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        fly.move();
        assertEquals("flyNum1 Fly is buzzing around in flight.\n", outContent.toString());
    }


    /**
     * Test method for{@link Fly#fly()}
     * @throws Exception
     */
    @Test
    public void fly() throws Exception {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        fly.fly();
        assertEquals("flyNum1 Fly is buzzing around in flight.\n", outContent.toString());
    }

}