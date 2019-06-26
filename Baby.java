import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText("Score : "+Score.jumlah_skor,85,30);
        getWorld().showText("Nyawa : "+Nyawa.jumlah_nyawa,750,30);
        tombol();
        menang();
    }
    public void tombol(){
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - 5, this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + 5, this.getY());
        }
}
    public void menang(){
        if(Score.jumlah_skor >= 100){
            Greenfoot.setWorld(new Win());
        }
    }
}