
/**
 * Ein schwarzer Kreis
 * 
 * @author Paul Schulte 
 * @version 1.0
 */
import sas.*;

public class schwarzerKreis
{
    private View view;
    private Circle circle;
     /**
     * Konstruktor für Objekte der Klasse schwarzerKreis
     */
    public schwarzerKreis()
    {
       view = new View("Schwarzer Kreis");
       circle = new Circle(150, 50, 150);
       
    }
}
