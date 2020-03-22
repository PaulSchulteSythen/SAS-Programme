/**
 * Zeichnung zweier Vierecke
 * 
 * @author Paul Schulte 
 * @version 03-22-2020
 */
import sas.*;
import java.awt.Color;
public class Malewitsch2
{
    View view;
    Rectangle hintergrund;
    Rectangle s_rectangle;
    Rectangle r_rectangle;
    /**
     * Konstruktor für Objekte der Klasse Malewitsch
     */
    public Malewitsch2()
    {
        view = new View(330, 470, "Zwei Vierecke");
        hintergrund = new Rectangle(2, 2, 596, 396, "texturMalewitsch.png");
        hintergrund.move(-120);
        hintergrund.turn(90);
        hintergrund.move(50);
        s_rectangle = new Rectangle(50, 30, 200, 180, Color.BLACK);
        s_rectangle.turn(-10);
        r_rectangle = new Rectangle(60, 270, 150, 150, new Color(140,50,47));
        r_rectangle.turn(20);
        
    }
}
