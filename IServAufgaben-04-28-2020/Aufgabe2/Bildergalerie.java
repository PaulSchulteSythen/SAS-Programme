/**
 *Bildergalerie nach Malewitsch
 * @author Paul Schulte
 * @version 1
*/
import sas.*;
import java.awt.Color;
class Bildergalerie {
 
  Bildergalerie(){
    View view = new View (600, 400, "bildergalerie");
    this.zeichneRahmen(10, 10, 100, 100, 10, Color.red);
    this.zeichneRahmen(130, 20, 150, 150, 30, Color.blue);
    this.zeichneRahmen(5, 180, 200, 70, 20, Color.magenta);
    this.zeichneRahmen(255, 190, 40, 40, 1, Color.black);
    this.zeichneRahmen(320, 15, 260, 230, 5, Color.green);
    this.zeichneRahmen(5, 280, 490, 110, 30, new Color(255, 175, 175));
  }

  void zeichneRahmen(int x, int y, int breite, int hoehe, int rahmenBreite, Color rahmenFarbe){ 
    Rectangle quadratAussen = new Rectangle(x, y, breite, hoehe, rahmenFarbe);
    Rectangle quadratInnen = new Rectangle(x + rahmenBreite, y + rahmenBreite, breite - 2 * rahmenBreite, hoehe - 2 * rahmenBreite, Color.white);
  }

}