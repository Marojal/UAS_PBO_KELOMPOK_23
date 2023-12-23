import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        prepare();
    }

    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,227,58);
        Charater charater = new Charater();
        addObject(charater,180,434);
        greenRocket greenRocket = new greenRocket();
        addObject(greenRocket,103,66);
        greenRocket.setLocation(66,64);
        pointKoin pointKoin = new pointKoin();
        addObject(pointKoin,272,36);
        pointKoin.setLocation(165,26);
        rocket.setLocation(298,47);
        pointKoin.setLocation(182,20);
        rocket.setLocation(480,74);
        pointKoin.setLocation(316,46);
        greenRocket.setLocation(108,0);
        pointKoin.setLocation(316,5);
        rocket.setLocation(520,3);
        CounterHp counterHp = new CounterHp("Hp: ");
        addObject(counterHp,54,23);
        CounterScore counterScore = new CounterScore("Score : ");
        addObject(counterScore,56,69);
    }

    private static final int Max=3;
    public void act(){
        int RocketCount= getObjects(Enemy.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&RocketCount<Max){
            addObject(new Rocket(),getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
        int greenCount= getObjects(Enemy.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&RocketCount<Max){
            addObject(new greenRocket(),getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
        int pointKointCount= getObjects(ObjectSpecial.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&RocketCount<Max){
            addObject(new pointKoin(),getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
    }
}
