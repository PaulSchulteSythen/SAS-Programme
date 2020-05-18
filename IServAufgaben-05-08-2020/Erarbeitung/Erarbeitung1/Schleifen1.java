
/**
 * Beschreiben Sie hier die Klasse Schleifen1.
 * 
 * @author Paul Schulte
 * @version 1
 */

import sas.*;
import java.awt.Color;
public class Schleifen1 {
  Circle ball;
  Rectangle roehre;
  View view;
  
  public static void main() {
  Schleifen1 programmobjekt = new Schleifen1();
  programmobjekt.fuehreAus();
  }
  
  Schleifen1() {
    view = new View();
    roehre = new Rectangle(10, 300, 580, 100, Color.GREEN);
    ball = new Circle(10,300, 50, Color.RED);
  }
  
  void fuehreAus() {
    while (roehre.contains(ball)) {
      ball.move(5,0);
      view.wait(100);
    }
  }
}

