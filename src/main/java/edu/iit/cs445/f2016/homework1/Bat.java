package edu.iit.cs445.f2016.homework1;

/**
 * Bat is a creature that knows how to fly.
 * Created by YongYang on 9/6/16.
 */
public class Bat extends Creature implements Flyer {

    /**
     * Constructor for Bat
     *
     * @param name
     */
    public Bat(String name) {
        super(name);
    }

    /**
     * A Bat eats only Creatures in the same way that any Creature eats.
     * If a bat eats something that is NOT an instance of Creature,
     * then it reports '{name} {class} won't eat a{aThing}.'
     */
    public void eat(Thing aThing) {
        if (aThing instanceof Creature) {
            super.eat(aThing);
        } else {
            System.out.println(this + " won't eat a " + aThing + ".");
        }
    }

    /**
     * if aThing is an instance neither of Creature nor Thing.
     * the bat is silent and does not eat the instance.
     * @param aThing
     */
    public void eat(Object aThing) {
        //do nothing
    }

    /**
     * When asked to move, a Bat flies.
     */
    @Override
    public void move() {
        fly();
    }


    /**
     * When asked to fly,
     * a Bat prints the message '{name} {class} is swooping through the dark.'
     */
    public void fly() {
        System.out.println(this + " is swooping through the dark.");

    }
}