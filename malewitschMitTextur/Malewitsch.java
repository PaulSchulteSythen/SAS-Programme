
/**
 * Zeichnung zweier Vierecke
 * 
 * @author Paul Schulte 
 * @version 03-22-2020
 */
import sas.*;
import java.awt.Color;
public class Malewitsch
{
    View view;
    Rectangle hintergrund;
    Rectangle s_rectangle;
    Rectangle r_rectangle;
    /**
     * Konstruktor für Objekte der Klasse Malewitsch
     */
    public Malewitsch()
    {
        view = new View("Schwarzes und rotes Viereck");
        hintergrund = new Rectangle(2, 2, 596, 396, "texturMalewitsch.png");
        s_rectangle = new Rectangle(50, 110, 200, 180, Color.BLACK);
        s_rectangle.turn(-10);
        r_rectangle = new Rectangle(350, 125, 150, 150, new Color(140,50,47));
        r_rectangle.turn(20);
        
    }
}
