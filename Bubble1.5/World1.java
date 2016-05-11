import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class World1 extends WorldPlay
{

    private SimpleTimer timeBubRes;
    private SimpleTimer timeBubPoint;
    private SimpleTimer timePincho;

    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {
        super(9.8F);
        addCameraFollower(new Drone(), 0, 0);
        prepare();
        timeBubRes = new SimpleTimer();
        timeBubPoint = new SimpleTimer();
        timePincho = new SimpleTimer();
        
        
        
    }
    /**
     * act - Este es el metodo actua de World1.
     * 
     */
    public void act()
    {
        
        if(timeBubRes.millisElapsed() > 10000) {
            generateBubbleResistance();
            timeBubRes.mark();
        }
        if(timeBubPoint.millisElapsed() > 10500) {
            generateBubblePoint();
            timeBubPoint.mark();
        }
        if(timePincho.millisElapsed() > 12000) {
            generateObstaclePinchos();
            timePincho.mark();
        }
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    Ventilador ventilador = new Ventilador();
    addObject(ventilador,511,304);
    ventilador.setLocation(504,298);
    ventilador.setLocation(503,297);
    ventilador.setLocation(501,296);
    }
    
    /**
     * generateBubbleResistance - crea varias burbujas de resistencia
     */
    public void generateBubbleResistance()
    {
        BubbleResistance bubRes = new BubbleResistance();
        addObject(bubRes,Greenfoot.getRandomNumber(getWidth()),0);        
    }
    /**
     * generateBubbleResistance - crea varias burbujas de bonificacion
     */
    public void generateBubblePoint()
    {
        BubblePoint bubPoint = new BubblePoint();
        addObject(bubPoint,Greenfoot.getRandomNumber(getWidth()),0);        
    }
     /**
     * generateObstaclePinchos - crea varios  obstaculos pinchos 
     */
    public void generateObstaclePinchos()
    {
        Pinchos newPinchos = null;
        if(Greenfoot.getRandomNumber(2) == 1) {    
           newPinchos = new PinchosUp();
        }
        else {
           newPinchos = new PinchosDown();
        }
           addObject(newPinchos,getWidth(),Greenfoot.getRandomNumber(getHeight()));      
    }
    
}
