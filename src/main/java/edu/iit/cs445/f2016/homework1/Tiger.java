package edu.iit.cs445.f2016.homework1;

/**
 * Tiger is a creature that knows how to speak.
 * Created by YongYang on 9/6/16.
 */
public class Tiger extends Creature {
    /**
     * Constructor for tiger
     * @param name
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * When asked to move,
     * a Tiger prints '{name} {class} has just pounced.'
     */
    @Override
    public void move() {
        System.out.println(this + " has just pounced.");
    }
}
