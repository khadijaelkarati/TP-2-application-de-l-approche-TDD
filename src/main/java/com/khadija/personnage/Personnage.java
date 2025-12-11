package com.khadija.personnage;

public class Personnage {
    private Orientation orientation;

    // Constructeur pour initialiser l'orientation du personnage en Nord
    public Personnage(){
        this.orientation = Orientation.NORD;
    }

    // Méthode qui fait tourner le personnage un nombre de fois donné
    public Orientation tourner(int fois){
        return orientation; // Retouner orientation au lieu de null
    }











    public enum Orientation{
        NORD, EST, SUD, OUEST
    }
}
