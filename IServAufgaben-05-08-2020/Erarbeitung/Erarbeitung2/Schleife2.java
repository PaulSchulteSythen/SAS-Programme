
/**
 * Beschreiben Sie hier die Klasse Schleife2.
 * 
 * @author Paul Schulte 
 * @version 1
 */
import sas.*;
import java.awt.Color;
public class Schleife2 {
    View view;
    Rectangle boden;
    Circle ball;
    Rectangle hindernis;
    
    public static void main(String[] args){
     Schleife2 schleife2 = new Schleife2();
     schleife2.fuehreAus();
    }

    Schleife2() {
        view = new View(); 
        boden = new Rectangle(0,390,600,10, Color.BLUE);
        ball = new Circle(10,349, 20, Color.RED);
        hindernis = new Rectangle(370, 209, 40,180, Color.GREEN);
    }

    void fuehreAus() {
        while (!ball.intersects(hindernis)){
            ball.move(2,0);
            view.wait(50); 
        }

        int drehwinkel = 0;
        while (drehwinkel<90) {
            hindernis.turn(410, 389, 5);
            view.wait(100);
            drehwinkel = drehwinkel+5;
        }
    }

}

