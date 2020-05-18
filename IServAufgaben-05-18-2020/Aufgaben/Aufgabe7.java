
/**
 * Aufgabe7.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe7{
    View view;
    Rectangle boden;
    Sprite roboter;
    public Aufgabe7(){
        view = new View();
        boden = new Rectangle(0, 0, 600, 400, Color.GREEN);
        Rectangle weiss = new Rectangle(50, 50, 500, 300, Color.WHITE);
        roboter = new Sprite();
        roboter.add(new Circle(0, 350, 25, Color.RED));
        roboter.add(new Circle(15, 365, 10, Color.BLUE));
    }

    void run(){
        while(true){
            while(boden.contains(roboter)){
                roboter.move(5, 0);
                view.wait(50);
            }roboter.move(-5, 0);
            while(boden.contains(roboter)){
                roboter.move(0, -5);
                view.wait(50);
            }roboter.move(0, 5);
            while(boden.contains(roboter)){
                roboter.move(-5, 0);
                view.wait(50);
            }roboter.move(5, 0);
            while(boden.contains(roboter)){
                roboter.move(0, 5);
                view.wait(50);
            }roboter.move(0, -5);
        }
    }
}
