import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Land land = new Land();
        addObject(land,500,577);
        Plankton plankton = new Plankton();
        addObject(plankton,61,469);
        Jellyfish jellyfish = new Jellyfish();
        addObject(jellyfish,521,349);
        ChumStick chumStick = new ChumStick();
        addObject(chumStick,417,351);
        chumStick.setLocation(492,349);
        jellyfish.setLocation(508,414);
    }
}
