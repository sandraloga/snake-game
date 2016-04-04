import java.awt.Color;
import java.util. ArrayList;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake
{
    private int altoLienzo;
    private int anchoLienzo;
    private final Color COLOR_SERPIENTE ;
    private final int NUMERO_SEGMENTOS_INICIALES;
    private ArrayList<Segment> segmentos;

    /**
     * Constructor for objects of class Snake
     */
    public Snake(int altoLienzo , int anchoLienzo)
    {
        this.altoLienzo = altoLienzo;
        this.anchoLienzo = anchoLienzo;
        NUMERO_SEGMENTOS_INICIALES = 3;
        segmentos = new ArrayList<>();
        COLOR_SERPIENTE = Color.BLACK;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return  y;
    }
}
