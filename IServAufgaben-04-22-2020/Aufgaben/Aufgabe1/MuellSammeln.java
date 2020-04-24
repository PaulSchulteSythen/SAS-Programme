
/**
 * Beschreiben Sie hier die Klasse MuellSammeln.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;
class MuellSammeln {
    View view;
    Sprite roboter;
    Circle muell1;
    Circle muell2; 
    Circle muell3;
    Circle muell4;
    Circle muell5;

    /**
     * Konstruktor für Objekte der Klasse MuellSammeln
     */
    MuellSammeln() {
        view = new View();
        new Picture(0,0,600,400,"landschaft.png");
        this.verteileMuell();
        this.konstruiereRoboter();
        this.sammleMuell();
        this.recycle();
    }

    /** 
     * Erstellt und zeichnet das Roboter-Objekt als Sprite
     */
    void konstruiereRoboter() {
        roboter = new Sprite();
        roboter.add(new Circle(10, 225, 25, Color.RED));
        roboter.add(new Rectangle(10,250, 50, 50, Color.MAGENTA));
    }

    /** 
     * Erstellt und zeichnet die Müllobjekte als Rechtecke 
     */
    void verteileMuell() {
        muell1 = new Circle(75, 280, 10, Color.YELLOW);
        muell2 = new Circle(125, 280, 10, Color.YELLOW); 
        muell3 = new Circle(175, 280, 10, Color.YELLOW);
        muell4 = new Circle(225, 280, 10, Color.YELLOW);
        muell5 = new Circle(275, 280, 10, Color.YELLOW);
    }

    /**
     * der Roboter entfernt die fünf Müllteile
     */
    void sammleMuell() {
        roboter.move(50,0);
        muell1.setHidden(true);
        view.wait(1000);
        roboter.move(50,0);
        muell2.setHidden(true);
        view.wait(1000);
        roboter.move(50,0);
        muell3.setHidden(true);
        view.wait(1000);
        roboter.move(50,0);
        muell4.setHidden(true);
        view.wait(1000);
        roboter.move(50,0);
        muell5.setHidden(true);
        view.wait(1000);
        roboter.move(50,0);
    }

    void recycle() {
        roboter.move(-50,0);
        muell5.setColor(Color.MAGENTA);
        muell5.setHidden(false);
        view.wait(1000);
        roboter.move(-50,0);
        muell4.setColor(Color.MAGENTA);
        muell4.setHidden(false);
        view.wait(1000);
        roboter.move(-50,0);
        muell3.setColor(Color.MAGENTA);
        muell3.setHidden(false);
        view.wait(1000);
        roboter.move(-50,0);
        muell2.setColor(Color.MAGENTA);
        muell2.setHidden(false);
        view.wait(1000);
        roboter.move(-50,0);
        muell1.setColor(Color.MAGENTA);
        muell1.setHidden(false);
        view.wait(1000);
        roboter.move(-50,0);
    }
}