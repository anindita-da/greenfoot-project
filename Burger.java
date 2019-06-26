import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends Actor
{
    /**
     * Act - do whatever the Burger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);
        jatuh();
    }    
    public void jatuh(){
        Actor kena_bayi = getOneIntersectingObject(Baby.class);
        if(kena_bayi != null){
            getWorld().removeObject(this);
            Score.skor_berkurang();
            Greenfoot.playSound("jaring.WAV");
        }else if(isAtEdge()){
            getWorld().removeObject(this);
            
        }
    }  
}