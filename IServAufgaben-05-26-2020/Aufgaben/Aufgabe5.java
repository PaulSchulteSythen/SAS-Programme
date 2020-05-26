
/**
 * Aufgabe5.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe5{
    View view;
    Rectangle hintergrund;
    Rectangle roboter;
    Circle munze;
    public Aufgabe5(){
        view = new View();
        hintergrund = new Rectangle(0, 0, 600, 400, Color.GREEN);
        roboter = new Rectangle(0, 350, 50, 50, Color.BLUE);
        munze = new Circle(Tools.randomNumber(0, 590), Tools.randomNumber(0, 390), 5, Color.YELLOW);
        this.run();
    }

    void run(){
        while(hintergrund.intersects(roboter)){
            while(hintergrund.intersects(roboter)){
                if(roboter.contains(munze)){
                    view.remove(munze);
                }
                roboter.move(15, 0);
                view.wait(50);
            }
            roboter.move(-5, 0);
            roboter.move(0, -40); //wenn der Roboter 50 (eigene Größe) höher gehen würde, würde er, wenn er den Ball vorher nur angeschnitten hat, ihn auch nachher nur anschneiden und nicht ganz umfangen. Deswegen greift die Funktion contains(shape) nicht und die Münze wird nicht aufgenommen
            
            while(hintergrund.intersects(roboter)){
                if(roboter.contains(munze)){
                    view.remove(munze);
                }
                roboter.move(-15, 0);
                view.wait(50);
            }
            roboter.move(5, 0);
            roboter.move(0, -40);
        }
    }
}
