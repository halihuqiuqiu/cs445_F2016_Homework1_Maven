package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YongYang on 9/7/16.
 */
public class ThingTest {
    /** Instantiation of Thing to test*/
    private Thing thing= new Thing("banana");

    /**
     * Test method for {@link Thing#getName()}.
     */
    @Test
    public void getName() throws Exception {
        assertEquals("banana", thing.getName());

    }

    /**
     * Test method for {@link Thing#toString()}.
     * The class of the instance is Thing
     */
    @Test
    public void toStringForThing() throws Exception {
        assertEquals("banana", thing.toString());

    }

    /**
     * Test method for {@link Thing#toString()}.
     * The class of the instance is not Thing
     */
    @Test
    public void toStringForNotThing() throws Exception {
        Tiger tiger = new Tiger("tigerNum1");
        assertEquals("tigerNum1 Tiger",tiger.toString());

    }


}