
/**
 * Aufgabe1.
 * 
 * @author Paul Schulte
 * @version 1
 */
import sas.*;
import java.awt.Color;

public class Aufgabe1{
    
    public Aufgabe1(){
        
    }
    
    public int maximum(int zahl1, int zahl2, int zahl3){
        int max = zahl1;
        if(zahl2 > zahl1){
            max = zahl2;
        }
        
        if (zahl3 > max){
            max = zahl3;
        }
        return max;
    }
}
