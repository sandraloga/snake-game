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
    public final int LONGUITUD_SEGMENTO = 50;
    private int direccion;
    private Color color;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX , int posicionY , int direccion)
    {
       
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        this.color = color.BLACK;
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
         Pen pen = new Pen (posicionX , posicionY , lienzo);
        pen.setColor(lienzo.getBackgroundColor());
        pen.turnTo(direccion);
        pen.move(LONGUITUD_SEGMENTO);
    }
    /**
     * Devuelve la posicion inicial de x
     */
    public int getPosicionInicialX()
    {
        return posicionX;
        
    }
    /**
     * Devuelve la posicion inicial de y
     */
    public int getPosicionInicialY()
    {
        return posicionY;
    }
    /**
     * Devuelve l posicion final de x
     */
    public int getPosicionFinalX()
    {
        if (direccion == 90 )
        {
            posicionX+=LONGUITUD_SEGMENTO;
        }
        if (direccion == 180)
        {
            posicionX-=LONGUITUD_SEGMENTO;
        }
        return posicionX;
    }
    /**
     * Devuelve la posicion final de y
     */
    public int getPosicionFinalY()
    {
        if (direccion == 90)
        {
            posicionY+=LONGUITUD_SEGMENTO;
        }
        if ( direccion == 270)
        {
           posicionY-=LONGUITUD_SEGMENTO; 
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
    /**
     * Comprueba que el segmento no colisione con el margen del lienzo.
     * En caso que colisione devuelve true
     */
    public boolean colisionaCon(Segment segmento)
    {
        boolean siColisiona = false;
        if (getPosicionInicialX() == segmento.getPosicionFinalX() && 
                getPosicionInicialY() == segmento.getPosicionFinalY())
                {
                    siColisiona = true;
                }
         return siColisiona;
                    
    }
    
}
