/**
 *Bildergalerie nach Malewitsch
 * @author Klaus Dingemann
 * @version 09.03.2016
*/
import sas.*;
import java.awt.Color;
class Bildergalerie {
 
  Bildergalerie(){
    View view = new View (602, 200, "bildergalerie");
    this.kreis(36, 23);
    this.kreuz();
    this.kreis(412, 23);
  }

  void quadrat(){
    this.zeichneRahmen(36,23,154,154);
    Rectangle quadrat = new Rectangle(48,35,130,130);
  }


  void kreuz(){
    this.zeichneRahmen(224,23,154,154);
    Rectangle rechteck1 = new Rectangle(276,25,50,150);
    Rectangle rechteck2 = new Rectangle(226,75,150,50);
  }

  void kreis(int x, int y){
    this.zeichneRahmen(x,y,154,154);
    Circle kreis = new Circle(x + 27,y + 4,61);
  }

  void zeichneRahmen(int x, int y, int breite, int hoehe){ 
    Rectangle quadratAussen = new Rectangle(x,y,breite, hoehe, Color.black);
    Rectangle quadratInnen = new Rectangle(x+2,y+2,breite - 4, hoehe - 4, Color.white);
  }

}