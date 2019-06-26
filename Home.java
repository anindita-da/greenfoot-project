import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
public GreenfootSound music = new GreenfootSound("backsound.mp3");
    public void started() 
    {
        music.setVolume(50);
        music.play();
    }

    public void stopped()
    {
        music.stop();
        music.pause();
    }

    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(885, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,605,383);
    }
}
