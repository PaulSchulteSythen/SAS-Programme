
/**
 * Aufgabe2.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe2{
    View view;
    Circle circle;
    Boolean pressed;
    public Aufgabe2(){
        view = new View();
        circle = new Circle(275, 175, 25, Color.RED);
        pressed = false;
        while(true){
            this.run();
        }
    }
    
    void run(){
        if(view.keyDownPressed()){
            circle.move(0, 5);
        }
        if(view.keyUpPressed()){
            circle.move(0, -5);
        }
        if(view.keyLeftPressed()){
            circle.move(-5, 0);
        }
        if(view.keyRightPressed()){
            circle.move(5, 0);
        }
        view.wait(50);
        
        if (!view.keyPressed('f')){
            pressed = false;
        }
        if(view.keyPressed('f') && !pressed){
            pressed = true;
            if(circle.getColor() == Color.RED){
                circle.setColor(Color.BLUE);
            }else{
                circle.setColor(Color.RED);
            }
        }
        
    }
}
