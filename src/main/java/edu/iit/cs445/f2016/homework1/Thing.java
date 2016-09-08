package edu.iit.cs445.f2016.homework1;

/**
 * Thing is the top of a class hierarchy.
 * Created by YongYang on 9/7/16.
 */
public class Thing {
    /**The name of the Thing*/
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Constructor for Thing
     * @param name
     */
    public Thing(String name) {
        this.name=name;
    }

    /**
     * Produce a String description of this instance.
     * If the class of the instance is Thing, then return only the name of the Thing.
     * Otherwise add the name of the class after the name of the thing
     */
    @Override
    public String toString() {
        String className=getClass().getSimpleName();
        if(className.equals("Thing")){
            return getName();
        }else{
            return getName() + " " + className;
        }

    }
}
