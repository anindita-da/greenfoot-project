import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cola extends Actor
{
    /**
     * Act - do whatever the Cola wants to do. This method is called whenever
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
            Nyawa.jumlah_nyawa--;
            Nyawa.nyawa_berkurang();
            Greenfoot.playSound("cola.WAV");
        }else if(isAtEdge()){
            getWorld().removeObject(this);
            
        }
    }   
}