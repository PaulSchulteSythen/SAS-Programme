
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import sas.*;
public class Test
{
    private View view;
    private Rectangle rectangle;
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
   
    /**
     * Konstruktor für Objekte der Klasse Test
     */
    public Test()
    {
       view = new View(500, 500, "Testprogramm");
       rectangle = new Rectangle(200, 200, 100, 100);
       while(!view.keyBackspacePressed()){
           if(view.keyDownPressed()){
               rectangle.setDirection(180);
               rectangle.move(10);
           }else if(view.keyUpPressed()){
               rectangle.setDirection(0);
               rectangle.move(10);
           }else if(view.keyLeftPressed()){
               rectangle.setDirection(270);
               rectangle.move(10);
           }else if(view.keyRightPressed()){
               rectangle.setDirection(90);
               rectangle.move(10);
           }
           long startTime = Tools.getStartTime();
           while(Tools.getElapsedTime(startTime) < 0.1){
               continue;
           }
       }
    }
}
