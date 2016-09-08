package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Unit test for Class Creature
 * Created by YongYang on 9/6/16.
 */
public class CreatureTest {

    // make a concrete class inherited from abstract class Creature to test

    public class InheritFromCreature extends Creature{
        public InheritFromCreature(String name){
            super(name);
        }
        @Override
        public void move() {

        }
    }
    /** Instantiation of InheritFromCreature to test*/
    private Creature creature = new InheritFromCreature("inheritFromCreature");

    /**
     * Test method for {@link Creature#getEatThing()}
     * @throws Exception
     */
    @Test
    public void getEatThing() throws Exception {
        Thing thingToEat = new Thing("thingToEat");
        creature.setEatThing(thingToEat);
        assertEquals(creature.getEatThing(), thingToEat);
    }
    /**
     * Test method for {@link Creature#setEatThing(Thing)}
     * @throws Exception
     */
    @Test
    public void setEatThing() throws Exception {
        Thing thingToEat = new Thing("thingToEat");
        creature.setEatThing(thingToEat);
        assertEquals(creature.getEatThing(), thingToEat);
    }

    /**
     * Test method for {@link Creature#eat(Thing)}
     * @throws Exception
     */
    @Test
    public void eat() throws Exception {
        Thing thingToEat = new Thing("thingToEat");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        creature.eat(thingToEat);
        assertEquals(
                "inheritFromCreature InheritFromCreature has just eaten a thingToEat.\n",
                outContent.toString());
    }
    /**
     * Test method for {@link Creature#eat(Thing)} ()}
     * @throws Exception
     */

    @Test
    public void eatChangeLastEatingThing() throws Exception {
        Thing thingToEat = new Thing("thingToEat");
        creature.eat(thingToEat);
        assertEquals(creature.getEatThing(),thingToEat);
    }

    /**
     * Test method for {@link Creature#whatDidYouEat()}
     * @throws Exception
     */
    @Test
    public void whatDidYouEatForNothing() throws Exception {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        creature.whatDidYouEat();
        ;
        assertEquals(
                "inheritFromCreature InheritFromCreature has had nothing to eat!\n",
                outContent.toString());
    }

    /**
     * Test method for {@link Creature#whatDidYouEat()}
     * @throws Exception
     */
    @Test
    public void whatDidYouEatForNotNothing() throws Exception {
        Thing thingToEat = new Thing("thingToEat");
        creature.eat(thingToEat);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        creature.whatDidYouEat();
        ;
        assertEquals(
                "inheritFromCreature InheritFromCreature has eaten a thingToEat!\n",
                outContent.toString());
        ;
    }

}