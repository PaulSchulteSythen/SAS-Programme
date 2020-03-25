import sas.*;
import java.awt.Color;

class Acrylbild{
    
    Acrylbild(){
        View view = new View(300, 300);
        
        Rectangle rectangleBlack = new Rectangle(0, 75, 150, 150, Color.BLACK);
        
        Rectangle rectangleRed = new Rectangle(225, 0, 75, 75, Color.RED);
        Rectangle rectangleYellow = new Rectangle(225, 75, 75, 75, Color.YELLOW);
        Rectangle rectangleGreen = new Rectangle(225, 150, 75, 75, Color.GREEN);
        Rectangle rectangleBlue = new Rectangle(225, 225, 75, 75, Color.BLUE); 
    }

}