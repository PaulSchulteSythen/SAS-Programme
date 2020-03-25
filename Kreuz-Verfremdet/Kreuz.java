import sas.*;

class Kreuz{
    Kreuz(){
        View view = new View();
        
        Rectangle rectangle = new Rectangle(250, 50, 100, 300);
        Polygon polygon = new Polygon(125, 150);
        polygon.add(350, 0);
        polygon.add(330, 100);
        polygon.add(0, 100);
    }
}