package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


/**
 * Unit test for Class Bat
 * Created by YongYang on 9/6/16.
 */
public class BatTest {
    /** Instantiation of Bat to test */
    private Bat bat =new Bat("batNum1");

    /**
     * Test method for {@link Bat#eat(Thing)}
     * @throws Exception
     */
    @Test
    public void eatCreature() throws Exception {
        Ant a = new Ant("antNum1");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bat.eat(a);
        assertEquals("batNum1 Bat has just eaten a antNum1 Ant.\n", outContent.toString());

    }
    /**
     * Test method for {@link Bat#eat(Thing)}
     * @throws Exception
     */
    @Test
    public void eatThingButNotCreature() throws Exception {
        Thing t = new Thing("banana");

        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bat.eat(t);
        assertEquals("batNum1 Bat won't eat a banana.\n", outContent.toString());

    }

    /**
     * Test method for {@link Bat#eat(Object)}
     * @throws Exception
     */
    @Test
    public void eatNotThing() throws Exception {
        Object b = new Object();

        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bat.eat(b);
        assertEquals("", outContent.toString());

    }

    /**
     * Test method for {@link Bat#move()}
     * @throws Exception
     */
    @Test
    public void move() throws Exception {
        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bat.move();
        assertEquals("batNum1 Bat is swooping through the dark.\n", outContent.toString());

    }

    /**
     * Test method for {@link Bat#fly()}
     * @throws Exception
     */
    @Test
    public void fly() throws Exception {
        ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bat.fly();
        assertEquals("batNum1 Bat is swooping through the dark.\n", outContent.toString());
    }

}