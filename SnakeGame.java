
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    // instance variables - replace the example below with your own
    private Canvas lienzo;
    private Snake snake;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;

    /**
     * Constructor for objects of class SnakeGame
     */
    public SnakeGame()
    {
       
       lienzo = new Canvas("Snake game", ANCHO_LIENZO, ALTO_LIENZO);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void drawSnake()
    {
        snake = new Snake (ANCHO_LIENZO,ALTO_LIENZO);
        lienzo.erase();
        snake.dibujar(lienzo);
        
    }
}
