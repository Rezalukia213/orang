import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        restart restart = new restart();
        addObject(restart,150,250);
        removeObject(restart);
        stars stars = new stars();
        addObject(stars,146,243);
    }
}
