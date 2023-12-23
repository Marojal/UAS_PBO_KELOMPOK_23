import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class greenRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class greenRocket extends Enemy
{
    /**
     * Act - do whatever the greenRocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int blinkCounter = 0;
    public greenRocket() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 50, image.getHeight() / 50); // Mengubah ukuran gambar menjadi setengah ukuran aslinya
        setImage(image);
        decreaseHp = false;
    }
    void cetakBaru(){
        greenRocket grenRkt= new greenRocket();
        getWorld().addObject(grenRkt,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+2);
    }
    public void act()
    {
        // Add your action code here.
        super.act();
        blinkCounter++;
        if (blinkCounter % (int)(1 * 60) == 0) { // Greenfoot runs at 60 frames per second
            getImage().setTransparency(getImage().getTransparency() == 0 ? 255 : 0);
        }
    }
}

