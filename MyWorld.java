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
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Land land = new Land();
        addObject(land,35,383);
        Land land2 = new Land();
        addObject(land2,110,382);
        Land land3 = new Land();
        addObject(land3,184,382);
        Land land5 = new Land();
        addObject(land5,133,316);
        Plankton plankton = new Plankton();
        addObject(plankton,25,339);
        land5.setLocation(107,322);
        ChumStick chumStick = new ChumStick();
        addObject(chumStick,136,265);
    }
}
