package edu.iit.cs445.f2016.homework1;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit test for Class CreatureTest
 * Created by YongYang on 9/6/16.
 */
public class TestCreatureTest {

    /**
     * Test method for get THING_COUNT.
     */
    @Test
    public void getThingCount() throws Exception {
        assertEquals(10, TestCreature.getThingCount());
    }

    /**
     * Test method for get CREATURE_COUNT.
     */
    @Test
    public void getCreatureCount() throws Exception {
        assertEquals(6, TestCreature.getCreatureCount());
    }

}