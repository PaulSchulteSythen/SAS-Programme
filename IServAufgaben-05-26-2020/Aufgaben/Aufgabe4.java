
/**
 * Aufgabe4.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe4{
    View view;
    Sprite auto;
    Rectangle strasse;
    Rectangle hindernisRechts;
    Rectangle hindernisLinks;
    Boolean stopped;

    public Aufgabe4() {
        view = View.getView();
        view.setName("Auto");
        strasse = new Rectangle(0, 370, 600, 400);
        auto = new Sprite();
        auto.add(new Rectangle(45, 320, 120, 40, Color.RED));
        auto.add(new Rectangle(125, 290, 40, 70, Color.RED));
        auto.add(new Rectangle(130, 295, 30, 25, Color.WHITE));
        auto.add(new Circle(60, 350, 10, Color.BLACK));
        auto.add(new Circle(130, 350, 10, Color.BLACK));
        hindernisLinks = new Rectangle(0, 240, 30, 129, Color.GREEN);
        hindernisRechts = new Rectangle(570, 240, 30, 129, Color.GREEN);
        stopped = false;
        while(!stopped){
            this.run();
        }
    } 

    void run() {
        while(!auto.intersects(hindernisLinks)){
            if(view.keyPressed('e')){
                stopped = true;
                return;
            }
            auto.move(-5, 0);
            view.wait(50);
        }
        auto.flipHorizontal();
        while(!auto.intersects(hindernisRechts)){
            if(view.keyPressed('e')){
                stopped = true;
                return;
            }
            auto.move(5, 0);
            view.wait(50);
        }
        auto.flipHorizontal();
    } 
}
