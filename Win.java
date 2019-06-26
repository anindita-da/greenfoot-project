import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
   public GreenfootSound tepuk = new GreenfootSound("winner.mp3");
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(885,600, 1); 
        tepuk.setVolume(100);
        tepuk.play();
    }
}
