package com.khadija.personnage;

public class Personnage {
    private Orientation orientation;

    // Constructeur pour initialiser l'orientation du personnage en Nord
    public Personnage(){
        this.orientation = Orientation.NORD;
    }

    // Méthode qui fait tourner le personnage un nombre de fois donné
    public Orientation tourner(int fois){
        if(fois % 4 == 1){
            orientation = Orientation.EST;
        }
        if(fois % 4 == 2){
            orientation = Orientation.SUD;
        }
        if(fois % 4 == 3){
            orientation = Orientation.OUEST;
        }
        return orientation;
    }











    public enum Orientation{
        NORD, EST, SUD, OUEST
    }
}
