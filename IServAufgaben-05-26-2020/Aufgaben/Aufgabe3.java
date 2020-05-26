
/**
 * Aufgabe3.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe3{

    View view;
    Circle ball;
    Rectangle korb;
    Rectangle hintergrund;
    Boolean gefangen;

    public Aufgabe3(){
        view = new View();
        hintergrund = new Rectangle(0, 0, 600, 400, Color.YELLOW);
        ball = new Circle(290, 20, 20, Color.BLUE);
        korb = new Rectangle(275, 340, 50, 60, Color.GREEN);
        gefangen = false;
        ball.moveTo(Tools.randomNumber(20, 540), 20);
        while(true){
            this.run();
        }
    }

    void run(){
        while(!gefangen){
            //ball
            if(hintergrund.contains(ball)){
                ball.move(0, 5);
            }else{
                ball.moveTo(Tools.randomNumber(20, 540), 20);
            }
            if(korb.contains(ball)){
                gefangen = true;
            }

            //korb
            if(view.keyLeftPressed()){
                korb.move(-10, 0);
            }
            if(view.keyRightPressed()){
                korb.move(10, 0);
            }
            view.wait(50);
        }

    }
}
