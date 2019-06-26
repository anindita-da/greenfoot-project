import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends World
{

    /**
     * Constructor for objects of class Lose.
     * 
     */
    public GreenfootSound kalah = new GreenfootSound("gameover.mp3");
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(885, 600, 1); 
        kalah.setVolume(100);
        kalah.play();
    }
}
