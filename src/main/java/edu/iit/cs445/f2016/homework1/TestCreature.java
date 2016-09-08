package edu.iit.cs445.f2016.homework1;

/**
 * TestCreature is a tester/demonstration program to exercise the Thing class hierarchy.
 * Created by YongYang on 9/6/16.
 */
public class TestCreature {
    /**
     * number of things to create
     */
    public static final int THING_COUNT = 10;
    /**
     * number of Creatures to create
     */
    public static final int CREATURE_COUNT = 6;

    /**
     * Constructor for TestCreature
     */
    public TestCreature() {
        super();
    }

    /**
     * @return the thingCount
     */
    public static int getThingCount() {
        return THING_COUNT;
    }

    /**
     * @return the creatureCount
     */
    public static int getCreatureCount() {
        return CREATURE_COUNT;
    }

    /**
     * The start of the program
     *
     * @param args command line arguments to the program
     */
    public static void main(String[] args) {

        Creature[] creatureArray = new Creature[CREATURE_COUNT];
        creatureArray[0] = new Bat("batNum1");
        creatureArray[1] = new Fly("flyNum1");
        creatureArray[2] = new Tiger("tigerNum1");
        creatureArray[3] = new Ant("antNum1");
        creatureArray[4] = new Ant("antNum2");
        creatureArray[5] = new Ant("antNum3");

        Thing[] thingArray = new Thing[THING_COUNT];
        thingArray[0] = new Thing("Banana");
        thingArray[1] = new Thing("Locomotive");
        thingArray[2] = new Thing("Car");

        thingArray[3] = creatureArray[0];
        thingArray[4] = creatureArray[1];
        thingArray[5] = creatureArray[2];
        thingArray[6] = creatureArray[3];

        thingArray[7] = new Tiger("tigerNum2");
        thingArray[8] = new Tiger("tigerNum3");
        thingArray[9] = new Tiger("tigerNum4");

        System.out.println("Things:\n");
        for (Thing t : thingArray) {
            System.out.println(t.getName());
        }
        System.out.println("");

        System.out.println("Creatures:\n");
        for (Creature c : creatureArray) {
            System.out.println(c.getName());
        }
        System.out.println("");


        // test Bat Class
        Bat bat2 = new Bat("bat2"); // Creature don't have the eat(Object
        // aThing)
        Object object1 = new Object();
        bat2.eat(object1);
        bat2.whatDidYouEat(); // test the bat
        // the bat should be silent and not eat the
        // instance if aThing is an instance neither of
        // Creature nor Thing

        creatureArray[0].eat(thingArray[0]);  // banana
        creatureArray[0].whatDidYouEat();
        creatureArray[0].eat(creatureArray[1]);   //fly1 Fly
        creatureArray[0].whatDidYouEat();
        creatureArray[0].move();
        System.out.println("");

        // test Flyer Class
        creatureArray[1].eat(thingArray[0]);
        creatureArray[1].whatDidYouEat();
        creatureArray[1].eat(creatureArray[1]);
        creatureArray[1].whatDidYouEat();
        creatureArray[1].move();
        System.out.println("");

        // test Tiger Class
        creatureArray[2].eat(thingArray[0]);
        creatureArray[2].whatDidYouEat();
        creatureArray[2].eat(creatureArray[1]);
        creatureArray[2].whatDidYouEat();
        creatureArray[2].move();
        System.out.println("");

        // test Ant Class
        creatureArray[3].eat(thingArray[0]);
        creatureArray[3].whatDidYouEat();
        creatureArray[3].eat(creatureArray[1]);
        creatureArray[3].whatDidYouEat();
        creatureArray[3].move();

    }

}