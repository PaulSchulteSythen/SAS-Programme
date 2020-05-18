
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
    Circle merkur, venus, erde, mars, jupiter, saturn, uranus, neptun;
    public Aufgabe4(){
        view = new View(500, 500);
        view.setBackgroundColor(Color.black);
        Circle sonne = new Circle(220, 220, 30, Color.yellow);                   //Sonne ist gelb
        merkur = new Circle(200, 230, 3, new Color(184, 184, 184));              //Merkur ist grau
        venus = new Circle(180, 230, 5, Color.red);                              //Venus ist rot
        erde = new Circle(165, 230, 5, Color.blue);                              //Erde ist blau
        mars = new Circle(150, 230, 5, Color.magenta);                           //Mars is magenta/pink
        jupiter = new Circle(120, 230, 12, new Color(255, 201, 0));              //Jupiter ist orange/gelb
        saturn = new Circle(90, 230, 10, new Color(255, 175, 174));              //Saturn ist beige
        uranus = new Circle(60, 230, 10, Color.green);                           //Uranus ist grün
        neptun = new Circle(30, 230, 10, new Color(0, 255, 255));                //Neptun ist blau
    }

    void run(){
        double x = 1; //Konstante um die Schnelligkeit der Bewegung der Planeten verhältnismäßig zu halten
        while(true){
            if(x< 10000){
                x += x*0.1;
            }
            merkur.turn(250, 250, x/88);   
            venus.turn(250, 250, x/225);   
            erde.turn(250, 250, x/365);   
            mars.turn(250, 250, x/687);   
            jupiter.turn(250, 250, x/(12 * 365));   
            saturn.turn(250, 250, x/(29 * 365));   
            uranus.turn(250, 250, x/(84 * 365));   
            neptun.turn(250, 250, x/(165 * 365));   
            view.wait(50);
        }

    }
}
