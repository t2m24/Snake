// @author Tomas Sobek

import java.util.ArrayList;
import fri.shapesge.Stvorec;

public class Had {
    private int dlzka;
    private ArrayList<Stvorec> clanky = new ArrayList<>();
    
    public Had(int dlzka) {
        this.dlzka = dlzka;
        
        for (int i = 0; i < dlzka; i++) {
            Stvorec clanok = new Stvorec(0, 0);
            clanok.zmenFarbu("snakeGreen");
            clanok.zmenStranu(40);
            clanok.zmenPolohu(302 - (i * 40), 552);
            clanok.zobraz();
            this.clanky.add(clanok);
        }
    }
    
    public void posunDole() {
        for (Stvorec clanok : this.clanky) {
            clanok.posunZvisle(40);
        }
    }
    
    public void posunHore() {
        for (Stvorec clanok : this.clanky) {
            clanok.posunZvisle(-40);
        }
    }
    
    public void posunVlavo() {
        for (Stvorec clanok : this.clanky) {
            clanok.posunVodorovne(-40);
        }
    }
    
    
    public void posunVpravo() {
        for (Stvorec clanok : this.clanky) {
            clanok.posunVodorovne(40);
        }
    }
    
    public void vypisList() {
       for (int i = 0; i < this.clanky.size(); i++) {
            System.out.println(this.clanky.get(i).toString());
        } 
    }
    
    public void pridajClanok()  {
        
    }
}
