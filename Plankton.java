import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plankton extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int verticalSpeed;
    private int acceleration;
    private int jumpHeight;
    private int chumStickEaten;
    
    public Plankton(){
        verticalSpeed   = 0;
        acceleration    = 1;
        jumpHeight      = -17;
        chumStickEaten  = 0;
        //GreenfootImage image = getImage();
        //image.scale(image.getWidth()/13, image.getHeight()/13);
    }
    
    public void act()
    {
        move();
        checkFalling();
        eatChumStick();
        showStatus();
    }
    
    private void fall(){
        setLocation(getX(), getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + acceleration;
    }
    
    public void move(){
        if(Greenfoot.isKeyDown("right")){
            move(4);
        }
        
        if(Greenfoot.isKeyDown("left")){
            move(-4);
        }
        
        if(Greenfoot.isKeyDown("up")&&((onGround()==true)||(onJellyfish()==true))){
            verticalSpeed = jumpHeight;
            fall();
        }
    }
    
    // biar gak seperti melayang
    // under = null;
    boolean onGround(){ 
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Land.class);
        return under != null;
    }
    
    boolean onJellyfish(){ 
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Jellyfish.class);
        return under != null;
    }
    
    public void checkFalling(){
        if(onGround() == false){
            fall();
        }
        if(onJellyfish() == false) {
            fall();
        }
        
        if(onGround() == true){
            verticalSpeed = 0;
        }
    }
    
    public void eatChumStick()
    {
        //if collide with a pizza instance, it removes it, plays the wav sound file eat.wav, and pizzaEaten is incremented by 1
        if (isTouching(ChumStick.class))
        {
            removeTouching(ChumStick.class);
            chumStickEaten++;
        }
    }
    
    public void showStatus()
    {
        //will display the number of chum stick
        getWorld().showText("Chumstick : "+chumStickEaten,70,20);
    }
}
