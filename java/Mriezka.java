// @author Tomas Sobek
//mriezka v ktorom sa had pohybuje

import java.util.ArrayList;
import fri.shapesge.Obdlznik;

public class  Mriezka {
    public Mriezka() {
        //cyklus na vykreslenie vodorovnych ciar mriezky
        for (int x = 0; x <= 20; x++) {
            Obdlznik ciara = new Obdlznik(100, 150);
            ciara.zmenStrany(4, 800);
            ciara.zmenFarbu("interfaceGreen");
            ciara.posunVodorovne(x * 40);
            ciara.zobraz();
        }
        
        //cyklus na vykreslenie zvislych ciar mriezky
        for (int y = 0; y <= 20; y++) {
            Obdlznik ciara = new Obdlznik(100, 150);
            ciara.zmenStrany(800, 4);
            ciara.zmenFarbu("interfaceGreen");
            ciara.posunZvisle(y * 40);
            ciara.zobraz();
        }
    }
}
