
/**
 * Beschreiben Sie hier die Klasse Treppe.
 * 
 * @author Paul Schulte 
 * @version 1
 */

import sas.*;
import java.awt.Color;

public class Treppe{

    Circle ball;

    public Treppe(){
        View view = new View(500, 300);

        for(int i = 4; i > 0; i--){
            new Rectangle((4 - i) * 100, 300 - i * 50, 100, i * 50, Color.RED);
        }

        ball = new Circle(35, 70, 15, Color.BLUE);

        for(int i = 4; i > 0; i--){
            view.wait(1000);
            ball.move(100, 50);
        }

    }

}
