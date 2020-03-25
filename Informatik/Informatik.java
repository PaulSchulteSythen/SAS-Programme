import sas.*;
import java.awt.Color;

class Informatik{
    
    Informatik(){
        View view = new View();
        
        Rectangle background = new Rectangle(0, 0, 600, 400, Color.GREEN);
        
        Rectangle rectangle = new Rectangle(110, 150, 400, 75, Color.RED);
        rectangle.turn(45);
        Text text = new Text(165, 170, "INFORMATIK IST COOL", Color.YELLOW);
        text.turn(45);
        
    }
    
}