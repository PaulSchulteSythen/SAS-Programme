import sas.*;
import java.awt.Color;

class Blume{
    Blume(){
        View view = new View();
        
        Ellipse ellipse1 = new Ellipse(110, 170, 200, 60, Color.RED);
        Ellipse ellipse2 = ellipse1.clone();
        ellipse2.turn(300, 200, 90);
        Ellipse ellipse3 = ellipse2.clone();
        ellipse3.turn(300, 200, 90);
        Ellipse ellipse4 = ellipse3.clone();
        ellipse4.turn(300, 200, 90);
        
        Circle kreis = new Circle(265, 165, 35, Color.YELLOW);
    }
    
}