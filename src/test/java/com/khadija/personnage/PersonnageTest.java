package com.khadija.personnage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    Personnage personnage;
    @BeforeEach
    void setUp() {
        personnage = new Personnage();
    }

    @AfterEach
    void tearDown() {
        personnage = null;
    }

    @Test
    void tourner_zero_fois() {
        Personnage.Orientation result = personnage.tourner(0);
        assertThat(result).isEqualTo(Personnage.Orientation.NORD);

    }
    @Test
    void tourner_une_fois(){
        Personnage.Orientation result = personnage.tourner(1);
        assertThat(result).isEqualTo(Personnage.Orientation.EST);
    }
    @Test
    void tourner_deux_fois(){
        Personnage.Orientation result = personnage.tourner(2);
        assertThat(result).isEqualTo(Personnage.Orientation.SUD);
    }
    @Test
    void tourner_trois_fois(){
        Personnage.Orientation result = personnage.tourner(3);
        assertThat(result).isEqualTo(Personnage.Orientation.OUEST);
    }
    @Test
    void tourner_quatre_fois(){
        Personnage.Orientation result = personnage.tourner(4);
        assertThat(result).isEqualTo(Personnage.Orientation.NORD);
    }
    @Test
    void tourner_cinq_fois(){
        Personnage.Orientation result = personnage.tourner(5);
        assertThat(result).isEqualTo(Personnage.Orientation.EST);
    }
}
