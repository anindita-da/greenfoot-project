import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    public void act(){
        if(Greenfoot.getRandomNumber(600)<2){
            addObject(new Egg(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(500)<4){
            addObject(new Chicken(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(700)<2){
            addObject(new Burger(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(400)<2){
            addObject(new Cola(),Greenfoot.getRandomNumber(600),10);
        }
    }
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(885,600, 1); 
        prepare();
    }
    
    public void prepare(){
        Baby baby = new Baby();
        addObject(baby,429,540);
    }
}
