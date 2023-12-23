import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pointKoin extends ObjectSpecial
{
    // tambahkan baris berikut untuk membuat objek GreenfootSound
    private GreenfootSound coinSound = new GreenfootSound("coinsound.wav");
    
    // sisanya sama seperti sebelumnya
    public pointKoin() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 50, image.getHeight() / 50);
        setImage(image);
    }
    
    void cetakBaru(){
        pointKoin koin= new pointKoin();
        getWorld().addObject(koin,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+3);
    }
    public void act()
    {
        if (isTouching(Charater.class)) {
            coinSound.play(); // tambahkan baris ini untuk memutar suara koin saat bersentuhan dengan aktor lain
            }
        super.act();
    }
}
