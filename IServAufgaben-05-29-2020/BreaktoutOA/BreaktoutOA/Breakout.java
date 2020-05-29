import sas.*;
import java.awt.Color;

class Breakout{
    View view;
    Circle ball;    
    double xRichtung;
    double yRichtung;

    Rectangle bandeLinks;
    Rectangle bandeRechts;
    Rectangle bandeOben;
    Rectangle bandeUnten; 
    Rectangle schlaeger;

    Rectangle ziel1, ziel2, ziel3, ziel4, ziel5;

   Breakout(){
       view = new View(600, 400, "Breakout");
       ball = new Circle(295,195, 10, Color.blue);
       ball.setDirection(Tools.randomNumber(1,44));
       bandeLinks = new Rectangle(0,0, 10,400, Color.black);
       bandeRechts = new Rectangle(590,0, 10,400, Color.black);
       bandeOben = new Rectangle(0,0, 600,10, Color.black);
       bandeUnten = new Rectangle(0,390, 600,10, Color.red);
       schlaeger = new Rectangle(200,355, 50,5, Color.green);

        ziel1 = new Rectangle(100, 100, 10, 10, Color.orange);
        ziel2 = new Rectangle(200, 100, 10, 10, Color.orange);
        ziel3 = new Rectangle(300, 100, 10, 10, Color.orange);
        ziel4 = new Rectangle(400, 100, 10, 10, Color.orange);
        ziel5 = new Rectangle(500, 100, 10, 10, Color.orange);

        this.fuehreAus();
    }
    void aendereRichtung(double richtung){
       if(richtung == 1 || richtung == 3){
       ball.setDirection(360-ball.getDirection());
       } else if (richtung == 0){
         ball.setDirection(180-ball.getDirection());
       } else if (richtung == 2) {
                  ball.setDirection(180-ball.getDirection()+Tools.randomNumber(1,5));
            } 
   }
   //Implementiere die Methode
   void fuehreAus(){
        while(!ball.intersects(bandeUnten)){
            //Input
            if(view.keyLeftPressed()){
                schlaeger.move(-5, 0);
            }
            if(view.keyRightPressed()){
                schlaeger.move(5, 0);
            }
            
            //Points
            if(ball.intersects(ziel1)){
                ziel1.setHidden(true);
                this.aendereRichtung(2);
            }
            if(ball.intersects(ziel2)){
                ziel2.setHidden(true);
                this.aendereRichtung(2);
            }
            if(ball.intersects(ziel3)){
                ziel3.setHidden(true);
                this.aendereRichtung(2);
            }
            if(ball.intersects(ziel4)){
                ziel4.setHidden(true);
                this.aendereRichtung(2);
            }
            if(ball.intersects(ziel5)){
                ziel5.setHidden(true);
                this.aendereRichtung(2);
            }
            
            //wall collisioni
            if(ball.intersects(bandeOben)){
                this.aendereRichtung(0);
            }else if(ball.intersects(bandeLinks)){
                this.aendereRichtung(1);
            }else if(ball.intersects(bandeRechts)){
                this.aendereRichtung(3);
            }else if(ball.intersects(schlaeger)){
                this.aendereRichtung(2);
            }
            
            //move ball
            ball.move(5);
            
            
            view.wait(20);            
        }
    }

static void main() {
     Breakout bo = new Breakout();
     bo.fuehreAus();
  }
}