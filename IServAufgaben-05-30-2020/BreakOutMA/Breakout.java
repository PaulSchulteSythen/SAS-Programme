import sas.*;
import java.awt.Color;
class Breakout
{
    View view;
    Circle ball;    

    Rectangle bandeLinks;
    Rectangle bandeRechts;
    Rectangle bandeOben;
    Rectangle bandeUnten; 
    Rectangle schlaeger;

    Rectangle[] hindernisse;

    /**
     * Konstruktor für Objekte der Klasse Breakout
     */
    Breakout() {    
        view = new View(600, 400, "Breakout");
        ball = new Circle(295,195, 10, Color.blue);
        ball.setDirection(Tools.randomNumber(1,44));
        bandeLinks = new Rectangle(0,0, 10,400, Color.black);
        bandeRechts = new Rectangle(590,0, 10,400, Color.black);
        bandeOben = new Rectangle(0,0, 600,10, Color.black);
        bandeUnten = new Rectangle(0,390, 600,10, Color.red);
        schlaeger = new Rectangle(200,355, 50,5, Color.green);
        hindernisse = new Rectangle[25];
        for(int i = 0; i < 25; i++) {
            hindernisse[i] = new Rectangle(100 + i * 16, 100, 10, 10, Color.orange);
        }

    }

    void aendereRichtung(int richtung){
        if(richtung == 1 || richtung == 3){
            ball.setDirection(360-ball.getDirection());
        } else if (richtung == 0){
            ball.setDirection(180-ball.getDirection());
        } else if (richtung == 2) {
            ball.setDirection(180-ball.getDirection()+Tools.randomNumber(1,5));
        } 
    }

    int gibHindernisIndex(){
        int index = -1;
        for(int i = 0; i < this.hindernisse.length; i++){
            if(ball.intersects(hindernisse[i])){
                index = i;
            }
        }

        return index;
    }

    void fuehreAus(){
        while(!ball.intersects(bandeUnten)){
            // Tastatursteuerung
            if (view.keyLeftPressed()){
                schlaeger.move(-10);
            }
            if (view.keyRightPressed()){
                schlaeger.move(10);
            }
            if (ball.intersects(bandeOben)) {
                aendereRichtung(0);
            } 
            if (ball.intersects(bandeLinks)) {
                aendereRichtung(1);
            }
            if (ball.intersects(bandeRechts)) {
                aendereRichtung(3);
            }
            if (ball.intersects(schlaeger)){
                aendereRichtung(2);
            }
            int index = gibHindernisIndex();
            //implementiere hier was geschehen soll, wenn die 
            int hin = gibHindernisIndex();
            if(hin != -1){
                aendereRichtung(2);
                hindernisse[hin].setHidden(true);
            }

            ball.move(5);
            view.wait(20);
        }
    }

    static void main() {
        Breakout bo = new Breakout();
        bo.fuehreAus();
    }
}
 