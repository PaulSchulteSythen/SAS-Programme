
/**
 * Beschreiben Sie hier die Klasse BewegteVierecke.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color; 
class BewegteVierecke{
    //Attribute der Klasse BewegteVierecke
    Rectangle schwarzesRechteck;
    Rectangle rotesQuadrat; 

    BewegteVierecke(){
        View view = new View(350, 500, "Bewegte Vierecke");
        Rectangle hintergrund = new Rectangle(2,2,346,496,"texturMalewitsch.png");
        schwarzesRechteck = new Rectangle(90,30,200,180);
        rotesQuadrat = new Rectangle(112,350,100,100, new Color(140,50,47));
    }

    static void main(){  
        BewegteVierecke bewVier = new BewegteVierecke();
        bewVier.transformiere();
    }

    /**
     * Dreht das schwarze Viereck um 10 Grad nach rechts und das rote Quadrat um 10 Grad
     * nach links. Drehpunkt ist jeweils der Mittelpunkt der Shapes-Objekte.
     */
    void drehe() {
        schwarzesRechteck.turn(10);
        rotesQuadrat.turn(-10);
    }

    void skaliere(){
        schwarzesRechteck.scale(0.7, 0.7);
        rotesQuadrat.scale(1.3, 1.3);
    }

    void transformiere(){
        this.drehe();
        this.drehe();
        this.skaliere();
        rotesQuadrat.move(0, -60);
    }
}
