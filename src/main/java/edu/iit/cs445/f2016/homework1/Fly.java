package edu.iit.cs445.f2016.homework1;

/**
 * Fly is a creature that knows how to fly.
 * Created by YongYang on 9/6/16.
 */
public class Fly extends Creature implements Flyer {
    /**
     *Constructor for Fly
     * @param name
     */
    public Fly(String name) {
        super(name);
    }

    /**
     * A Fly eats only Things;
     */
    @Override
    public void eat(Thing aThing) {
        if (aThing instanceof Creature){
            System.out.println(this + " won't eat a "
                    + aThing + ".");
        } else { // eat only Thing and not Creature
            super.eat(aThing);
        }
    }


    /**
     * When asked to move, a Fly flies.
     */
    @Override
    public void move() {
        fly();

    }

    /**
     * When asked to fly,
     * a Fly prints the message '{name} {class} is buzzing around in flight.'
     */
    public void fly() {
        System.out.println(this + " is buzzing around in flight.");

    }
}

