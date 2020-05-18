
/**
 * Aufgabe6.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe6{
    View view;
    Text treffer;
    Text zeit;
    Circle circle;
    public Aufgabe6(){
        view = new View();
        view.setBackgroundColor(Color.YELLOW);
        treffer = new Text(10, 10, "Treffer: 0", Color.RED);
        zeit = new Text(500, 10, "Zeit: 0", Color.GREEN);
        circle = new Circle(287.5, 187.5, 15, Color.BLUE);
    }

    void run(){
        view.wait(3000);
        circle.setHidden(true);
        int i_treffer = 0;
        long start = Tools.getStartTime();
        while(i_treffer < 10){
            int x = Tools.randomNumber(15, 585);
            int y = Tools.randomNumber(30, 385);
            circle.moveTo(x, y);
            circle.setHidden(false);
            while(!circle.mousePressed()){
                zeit.setText("Zeit: " + Tools.getElapsedTime(start));
            }
            i_treffer++;
            circle.setHidden(true);
            treffer.setText("Treffer: " + i_treffer);
        }

    }
}


