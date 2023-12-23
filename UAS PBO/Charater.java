import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charater extends Actor
{
    /**
     * Act - do whatever the Burung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Charater(){
    GreenfootImage brg=new GreenfootImage("brg1.png");
    int lebar=60;
    int tinggi=60;
    brg.scale(lebar,tinggi);
    setImage(brg);
    }
    
    int lastNumberNo=1;
    int animationDelay=10;
    void animate(){
        if(animationDelay<10){
            animationDelay++;
            return;
        }
        
        animationDelay=0;
        if(lastNumberNo==9){
            lastNumberNo = 1;
        }else{
            lastNumberNo++;
        }
        GreenfootImage newImage=new GreenfootImage("brg"+lastNumberNo+".png");
        int lebar=60;
        int tinggi=60;                               ;
        newImage.scale(lebar,tinggi);
        setImage(newImage);
    }
    int Count = 0;
    void tambahPoint(){
       CounterScore.add(1);
       getWorld().removeObject(this);
    }
    
    public void act()
    {
        // Add your action code here.
        animate();
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 2, getY());
        }
        if(isTouching(Charater.class)){
            CounterHp.add(-1);
            tambahPoint();
        }
        if(CounterHp.value==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new GameOver());
            getWorld().removeObject(this);
        }
        if(CounterScore.value==10){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Win());
            getWorld().removeObject(this);
        }
    }
}
