// @author Tomas Sobek

import fri.shapesge.Manazer;

public class Main {
    
    public Main() {
        Mriezka mriezka = new Mriezka();
        Had had = new Had(4);
        Manazer manazer = new Manazer();
        manazer.spravujObjekt(had);
    }
}
