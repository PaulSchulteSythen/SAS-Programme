
/**
 * Beschreiben Sie hier die Klasse Aufgabe3.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;
public class Aufgabe3{
    Circle mond;
    View view;
    
    public Aufgabe3(){
        view = new View(510, 510);
        view.setBackgroundColor(Color.blue);
        
        Circle erde = new Circle(175, 175, 80, "erde.png");
        mond = new Circle(100, 100, 20, "mond.jpg");
    }
    
    void run(){
        while(!view.keyPressed(' ')){
            mond.turn(255, 255, 1);
            view.wait(10);
        }
        
    }
}
