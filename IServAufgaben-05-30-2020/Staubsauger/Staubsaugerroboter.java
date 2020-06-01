import sas.*;
import java.awt.Color;
class Staubsaugerroboter
{
  View view;
  Sprite roboter;
  Circle[] staubpartikel;
  
  Rectangle randlinks, randrechts, randoben, randunten;
 
  Staubsaugerroboter()
  {
    view = new View(600, 400, "Staubsauger");
    randlinks = new Rectangle(0, 0, 20, 400, Color.BLUE);
    randoben = new Rectangle(0, 0, 600, 20, Color.BLUE);
    randrechts = new Rectangle(580, 0, 20, 400, Color.BLUE);
    randunten = new Rectangle(0, 380, 600, 200, Color.BLUE);
    
    staubpartikel = new Circle[300];
    for(int i = 0; i < 300; i++){
        staubpartikel[i] = new Circle(Tools.randomNumber(20, 576), Tools.randomNumber(20, 376), 2, Color.black);
    }
    
    
    roboter = new Sprite();
    //Roboter wird in die Mitte der sichtbaren Zeichefläche gesetzt
    roboter.add(new Circle(270, 170, 30, Color.RED));
    roboter.add(new Circle(290, 190, 10, Color.BLUE));
    //und zufällig in eien Richtung gedreht
    roboter.setDirection(Tools.randomNumber(0,360));
  }   
  
 
  void saugeStaub(){
        for(int i = 0; i < 300; i++){
            if(roboter.contains(staubpartikel[i])){
                staubpartikel[i].setHidden(true);
            }
        }

     
  }
   
  void pruefeRand(){
    if (roboter.intersects(randlinks)) {
       roboter.setDirection(Tools.randomNumber(0,180));
    }
    if (roboter.intersects(randrechts)) {
       roboter.setDirection(Tools.randomNumber(180,360));
    }
    if (roboter.intersects(randoben)) {
        roboter.setDirection(Tools.randomNumber(90,270));
    }
    if (roboter.intersects(randunten)) {
        roboter.setDirection(Tools.randomNumber(270,450));
    }
  }
 
  void fuehreAus(){ 
    while (!view.keyPressed('e')){
      roboter.move(5);
      pruefeRand();
      saugeStaub();
      view.wait(10);
    }
  }
   
  static void main(){
      Staubsaugerroboter roboter = new Staubsaugerroboter();
      roboter.fuehreAus();
  }
}