
/**
 * Aufgabe3.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class BaelleFangen{

    View view;
    Circle[] balls;
    Rectangle korb;
    Rectangle hintergrund;
    Text gefangen, zeit;
    int gefangeneBaelle;

    public BaelleFangen(){
        view = new View();
        hintergrund = new Rectangle(0, 0, 600, 400, Color.YELLOW);

        //bälle erzeugen
        balls = new Circle[20];
        for(int i = 0; i < 20; i++){
            balls[i] = new Circle(Tools.randomNumber(20, 540), Tools.randomNumber(-200, 20), 20, Color.BLUE);
        }
        korb = new Rectangle(270, 330, 60, 70, Color.GREEN);
        
        //text: gefangen
        gefangen = new Text(20, 20, "Gefangen: 0", Color.red);
        gefangeneBaelle = 0;
        
        //text: zeit
        zeit = new Text(20, 50, "Zeit", Color.red);
        zeit.setHidden(true);
        
        //run
        this.run();
    }

    void run(){
        long startTime = Tools.getStartTime();
        while(gefangeneBaelle < 20){
            checkGefangen();
            moveBalls();
            //korb bewegen
            if(view.keyLeftPressed()){
                korb.move(-5, 0);   
            }
            if(view.keyRightPressed()){
                korb.move(5, 0);
            }
            gefangen.setText("Gefangen: " + String.valueOf(gefangeneBaelle));
            //deltaTime
            view.wait(20);
        }
        float timeNeeded = Tools.getElapsedTime(startTime);
        zeit.setText("Zeit: " + String.valueOf(timeNeeded) + " Sekunden");
        zeit.setHidden(false);

    }

    void checkGefangen(){
        for(int i = 0; i < 20; i++){
            if(korb.contains(this.balls[i]) && this.balls[i].getColor() == Color.blue){
                this.gefangeneBaelle += 1;
                this.balls[i].setColor(new Color(254, 200, 0));
            }
        }
    }

    void moveBalls(){
        for(int i = 0; i < 20; i++){
            balls[i].move(0, 2);
            if(balls[i].getCenterY() > 360){
                this.balls[i].setColor(new Color(254, 200, 0));
                if(!hintergrund.contains(balls[i])){
                    this.balls[i].moveTo(Tools.randomNumber(20, 540), Tools.randomNumber(-200, 20));
                    this.balls[i].setColor(Color.BLUE);
                }
            }
        }
    }
}
