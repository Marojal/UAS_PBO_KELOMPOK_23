import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectSpecial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ObjectSpecial extends Actor
{
    /**
     * Act - do whatever the ObjectSpecial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void cetakBaru();
    abstract void maju();
    private GreenfootSound coinSound = new GreenfootSound("coinsound.wav");
    
    void tambahPoint(){
        CounterScore.add(1);
        
        cetakBaru();
        getWorld().removeObject(this);
    }
    public void act()
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        if(isTouching(Charater.class)){
            tambahPoint();
            coinSound.play();
        }
        if(CounterHp.value==0){
            getWorld().removeObject(this);
        }
    }
}
