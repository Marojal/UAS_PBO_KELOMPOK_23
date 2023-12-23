import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Enemy
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 50, image.getHeight() / 50); // Mengubah ukuran gambar menjadi setengah ukuran aslinya
        setImage(image);
        
        decreaseHp = true;
    }
    
    void cetakBaru(){
        Rocket Rkt= new Rocket();
        getWorld().addObject(Rkt,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+2);
    }
    public void act()
    {
        // Add your action code here.
        super.act();
    }
}
