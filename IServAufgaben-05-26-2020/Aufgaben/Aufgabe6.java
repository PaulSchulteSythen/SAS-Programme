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
    Rectangle spielfeld;
    Circle kugel;
    Rectangle kanteUnten, kanteOben, kanteLinks, kanteRechts;
    public Aufgabe6(){
        view = new View();
        view.setBackgroundColor(Color.GREEN);
        kanteLinks = new Rectangle(0, 0, 20, 400, new Color(140, 69, 6));
        kanteRechts = new Rectangle(580, 0, 600, 400, new Color(140, 69, 6));
        kanteOben = new Rectangle(0, 0, 600, 20, new Color(140, 69, 6));
        kanteUnten = new Rectangle(0, 380, 600, 400, new Color(140, 69, 6));
        
        kugel = new Circle(Tools.randomNumber(20, 520), Tools.randomNumber(20, 320), 20, Color.RED);
        kugel.setDirection(Tools.randomNumber(0, 360));
        this.run();
    }

    void run(){
        while(!view.keyPressed('e')){
            if(kugel.intersects(kanteRechts)){
                kugel.move(-2);
                kugel.setDirection(360 - kugel.getDirection());
            }else if(kugel.intersects(kanteLinks)){
                kugel.move(-2);
                kugel.setDirection(360 - kugel.getDirection());
            }else if(kugel.intersects(kanteUnten)){
                kugel.move(-2);
                if(kugel.getDirection() > 180){
                    kugel.setDirection(270 + (270 -kugel.getDirection()));
                }else if(kugel.getDirection() < 180) {
                    kugel.setDirection(90 - (kugel.getDirection() - 90));
                }
            }else if(kugel.intersects(kanteOben)){
                kugel.move(-2);
                if(kugel.getDirection() > 90){
                    kugel.setDirection(270 - kugel.getDirection() + 270);
                }else{
                    kugel.setDirection(180 - kugel.getDirection());
                }
            }else{
                kugel.move(2);
            }
            view.wait(10);
        }
    }
}
