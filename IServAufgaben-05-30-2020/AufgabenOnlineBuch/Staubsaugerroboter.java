import sas.*;
import java.awt.Color;
class Staubsaugerroboter
{
    View view;
    Sprite roboter;
    Circle[] staubpartikel;

    Rectangle randlinks, randrechts, randoben, randunten, teppich, ladestation;
    Text T_anzahl;
    int i_anzahl;

    Staubsaugerroboter()
    {
        view = new View(600, 400, "Staubsauger");
        randlinks = new Rectangle(0, 0, 1, 400, Color.black);
        randoben = new Rectangle(0, 0, 600, 1, Color.black);
        randrechts = new Rectangle(599, 0, 600, 400, Color.black);
        randunten = new Rectangle(0, 399, 600, 400, Color.black);
        teppich = new Rectangle(0, 0, 600, 400, "teppich.jpg");
        ladestation = new Rectangle(0, 0, 100, 100, Color.yellow);

        //staubpartikel erzeugen
        staubpartikel = new Circle[300];
        for(int i = 0; i < 300; i++){
            staubpartikel[i] = new Circle(Tools.randomNumber(0, 596), Tools.randomNumber(20, 396), 2, Color.yellow);
        }   

        roboter = new Sprite();
        T_anzahl = new Text(285, 180, "000");
        //Roboter wird in die Mitte der sichtbaren Zeichefläche gesetzt
        roboter.add(new Circle(270, 170, 30, Color.BLUE));
        //roboter.add(new Picture(270, 170, "roboter.png"));     //Roboter wird langsamer
        roboter.add(T_anzahl);
        //und zufällig in eien Richtung gedreht
        roboter.setDirection(Tools.randomNumber(0,360));
        i_anzahl = 0;
    }   

    void saugeStaub(){
        for(int i = 0; i < 300; i++){
            if(roboter.contains(this.staubpartikel[i])){
                //staubpartikel verschwinden lassen
                this.staubpartikel[i].setHidden(true);
                i_anzahl++;
                this.staubpartikel[i] = new Circle(0, 0, 2, Color.yellow);  //damit die objekte nicht erneut kollidieren
                    
                //text setzen
                if(this.i_anzahl < 100){
                    this.T_anzahl.setText("0" + String.valueOf(i_anzahl));
                }else if(this.i_anzahl < 10){
                    this.T_anzahl.setText("00" + String.valueOf(i_anzahl));
                }else{
                    this.T_anzahl.setText(String.valueOf(i_anzahl));
                }
            }
        }

    }
    void pruefeRand(){
        if (roboter.intersects(randlinks)) {
            roboter.setDirection(Tools.randomNumber(0,180));
        }
        if (roboter.intersects(randrechts)) {
            roboter.setDirection(Tools.randomNumber(180,360));
        }
        if (roboter.intersects(randoben)) {
            roboter.setDirection(Tools.randomNumber(90,270));
        }
        if (roboter.intersects(randunten)) {
            roboter.setDirection(Tools.randomNumber(270,450));
        }
    }

    boolean pruefeLadestation(){
        if(view.keyPressed('l')){
            roboter.moveTo(20, 20);            
            return true;
        }else
            return false;
            
    }

    void fuehreAus(){ 
        while (!view.keyPressed('e')){
            if(!pruefeLadestation())
                roboter.move(5);
            pruefeRand();
            saugeStaub();
            view.wait(10);
        }
    }

    static void main(){
        Staubsaugerroboter roboter = new Staubsaugerroboter();
        roboter.fuehreAus();
    }
}