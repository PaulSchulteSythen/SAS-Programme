
/**
 * Beschreiben Sie hier die Klasse Kirchenfenster.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;
public class Kirchenfenster
{
    public Kirchenfenster()
    {
        new View (300, 500);
        new Rectangle(15, 130, 270, 340, Color.black);
        new Circle(15, 15, 135, Color.black);
        new Circle(100, 40, 40, new Color(253, 157, 158));
        this.figur(30, 200, Color.magenta);
        this.figur(155, 200, Color.yellow);
        this.figur(30, 365, Color.green);
        this.figur(155, 365, Color.red);
    
    }
    
    void figur(int anfangX, int anfangY, Color color){
        new Rectangle(anfangX, anfangY, 110, 90, color);
        new Circle(anfangX, anfangY - 55, 55, color);
    }

    
}
