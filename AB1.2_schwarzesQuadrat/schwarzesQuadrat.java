
/**
 * Zeichnet ein schwarzes Quadrat nach Malewitch.
 * 
 * @author Paul Schulte
 * @version 03-19-2020
 */
import sas.*;
public class schwarzesQuadrat
{
    View view;
    Rectangle quadrat;
    
    /**
     * Konstruktor für Objekte der Klasse schwarzesQuadrat
     */
    public schwarzesQuadrat()
    {
        view = new View(300, 300);
        quadrat = new Rectangle(20, 20, 260, 260);
    }

}
