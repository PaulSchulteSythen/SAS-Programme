
/**
 * Beschreiben Sie hier die Klasse Luftballon.
 * 
 * @author Paul Schulte
 * @version 1
 */

import sas.*;
import java.awt.Color;

public class Luftballon{
    public Luftballon(){
        View view = new View();
        Rectangle background = new Rectangle(0, 0, 600, 400, Color.YELLOW);
        Circle loon = new Circle(275, 175, 25, Color.RED);
        
        for(int i = 0; i < 6; i++){
            view.wait(1000);
            loon.scale(1.5, 1.5);
        }
        view.remove(loon);
        
        Text text = new Text(275, 175, "PENG", Color.GREEN);
        text.scale(3, 3);
    }
}
