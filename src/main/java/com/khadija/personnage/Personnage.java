package com.khadija.personnage;

public class Personnage {
    private Orientation orientation;

    // Constructeur pour initialiser l'orientation du personnage en Nord
    public Personnage(){
        this.orientation = Orientation.NORD;
    }

    // Méthode qui fait tourner le personnage un nombre de fois donné
    public Orientation tourner(int fois){
        if(fois == 1){
            orientation = Orientation.EST;
        }
        if(fois == 2){ // Ajouter la condition concernant deux rotation
            orientation = Orientation.SUD;
        }
        return orientation;
    }











    public enum Orientation{
        NORD, EST, SUD, OUEST
    }
}
