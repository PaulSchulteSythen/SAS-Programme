/**
 * Zeichnung eines Malewitsch-Bildes
 * 
 * @author Paul Schulte
 * @version (eine Versionsnummer oder ein Datum)
 */
import sas.*;
public class Malewitsch
{
    private View view;
    private Rectangle rectangle;
    private Circle circle;
    private Rectangle kreuz_r1, kreuz_r2;
    
    /**
     * Konstruktor für Objekte der Klasse malewitsch
     */
    public Malewitsch()
    {
        view = new View("Malewitsch-Zeichnung");
        
        rectangle = new Rectangle(21, 114, 172, 172);
        circle = new Circle(214, 114, 86);
        kreuz_r1 = new Rectangle(407, 171, 172, 57);
        kreuz_r2 = new Rectangle(464, 114, 57, 172);
    }    
}
