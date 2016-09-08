package edu.iit.cs445.f2016.homework1;

/**
 * A Creature is a Thing that has specific, 'lively' behaviors.
 * Created by YongYang on 9/6/16.
 */
public abstract class Creature extends Thing {

    /** The Last Thing A creature remember that it eat */
    private Thing lastEatThing=null;

    /**
     * Get the the Last Thing A creature remember that it eat
     * @return the eatThing
     */
    public Thing getEatThing() {
        return lastEatThing;
    }

    /**
     * @param eatThing the eatThing to set
     */
    public void setEatThing(Thing eatThing) {
        lastEatThing = eatThing;
    }

    /**
     * Constructor for Creature
     * @param name
     */
    public Creature(String name) {
        super(name);
    }
    /**
     * creatures eat whatever they are told
     * AND print a message stating '{this object} has just eaten a {a Thing}
     * @param aThing
     */
    public void eat(Thing aThing){
        lastEatThing=aThing;
        System.out.println(this + " has just eaten a " + aThing+ ".");
    }

    /**
     * Tell the Creature to move
     */
    public abstract void move();

    /**
     * Make the Creature tell what is in its stomach
     */
    public void whatDidYouEat(){
        if (this.lastEatThing==null){
            System.out.println(this + " has had nothing to eat!");
        }else{
            System.out.println(this + " has eaten a "+ lastEatThing + "!");
        }

    }

}
