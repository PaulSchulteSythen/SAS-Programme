
/**
 * Beschreiben Sie hier die Klasse Bild.
 * 
 * @author Paul Schulte 
 * @version 1
 */
import sas.*;
import java.awt.Color;
public class Bild
{
    public Bild()
    {
        View view = new View();
        Rectangle rectangle = new Rectangle (20, 20, 560, 360, Color.blue);
        Picture python = new Picture(30, 30, 540, 340, "python.png");
    }
}
