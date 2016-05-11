import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainBubble here.
 * 
 * @author Pedro Negrete
 * @version 30/04/2016
 */
public class MainBubble extends Bubble
{
    
    /**
     * 
     */
    public MainBubble()
    {
        super(9.8F, 1);
    }
    
    /**
     * Act - do whatever the MainBubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if(isTouching(Ventilador.class)) {
           setLocation(getX()+1,getY());
        }
    }
    /**
     * moveBubble - El metodo mueve la burbuja dependiendo de la fuerza
     * del viento que le llegue ala burbuja
     * @param fuerzaViento - fuerza del viento.
     * @param dirViento - direccion del viento.
     */
    public void moveBubble(int fuerzaViento,String dirViento)
    {
        if( fuerzaViento == 10 && dirViento == "Up") {
            
          
        }
       
        else if( fuerzaViento == 10 && dirViento == "Down") {
            
          
        }
        else if( fuerzaViento == 10 && dirViento == "Left") {
            
          
        }
        else if( fuerzaViento == 10 && dirViento == "Right") {
            
          
        }
    }
    
}
