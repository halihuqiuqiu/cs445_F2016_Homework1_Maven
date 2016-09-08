package edu.iit.cs445.f2016.homework1;

/**
 * Ant is a creature.
 * Created by YongYang on 9/6/16.
 */
public class Ant extends Creature {

    /**
     * Constructor for Ant
     * @param name
     */
    public Ant(String name) {
        super(name);
    }
    /**
     * When asked to move, an Ant prints '{name} {class} is crawling around.'
     */
    @Override
    public void move() {
        System.out.println(this + " is crawling around.");

    }
}
