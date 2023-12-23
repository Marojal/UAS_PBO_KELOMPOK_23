import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract void cetakBaru();
    abstract void maju();
    private GreenfootSound Boom = new GreenfootSound("boom.wav");
    protected boolean decreaseHp;
    
    void tambahPoint(){
        cetakBaru();
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        
        if(getWorld() != null){
            if(isTouching(Charater.class)){
                if(decreaseHp){
                    CounterHp.add(-1); // Decrease HP
                } else {
                    CounterScore.add(-1); // Decrease score
                }
                Boom.play();
                tambahPoint();
            }
        }
    }
}