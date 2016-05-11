import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldPlay here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class WorldPlay extends ScrollWorld
{

    private float gravity;
    
    /**
     * Constructor for objects of class WorldPlay.
     * @param worldGravity Gravedad del mundo
     */
    public WorldPlay(float worldGravity)
    {    
        super(1000, 545, 1, 8000, 545);
        gravity = worldGravity;
    }
    
    /**
     * @return gravity Gravedad del mundo
     */
    public float getGravity()
    {
        return gravity;
    }
}
