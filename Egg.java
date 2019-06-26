import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
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
            Score.jumlah_skor+=10;
            Greenfoot.playSound("makan.wav");
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
   }
}