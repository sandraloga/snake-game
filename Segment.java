import java.awt.Color;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    private int posicionX;
    private int posicionY;
    public final int LONGUITUD_SEGMENTO = 4;
    private int direccion;
    private Color color;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX , int posicionY , int direccion , Color color)
    {
       
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        this.color = color;
    }

    /**
     * Dibuja un segmento
     */
    public void dibujar( Canvas lienzo)
    {
        Pen pen = new Pen (posicionX , posicionY , lienzo);
        pen.setColor(color);
        pen.turnTo(direccion);
        pen.move(LONGUITUD_SEGMENTO);
    }
    /**
     * Borrar lienzo
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.erase();
    }
    /**
     * Devuelve la posicion inicial de x
     */
    public int getPosicionIcialX()
    {
        return posicionX;
        
    }
    /**
     * Devuelve la posicion inicial de y
     */
    public int getPosicionIniciaY()
    {
        return posicionY;
    }
    /**
     * Devuelve l posicion final de x
     */
    public int getPosicionFinalX()
    {
        if (direccion == 90 || direccion == 180)
        {
            posicionX+=LONGUITUD_SEGMENTO;
        }
        return posicionX;
    }
    /**
     * Devuelve la posicion final de y
     */
    public int getPosicionFinalY()
    {
        if (direccion == 90 || direccion == 270)
        {
            posicionY+=LONGUITUD_SEGMENTO;
        }
        return posicionY;
    }
    /**l
     * Devuelve el angulo de direción
     */
    public int getDireccion()
    {
        return direccion;
    }
    
    
}
