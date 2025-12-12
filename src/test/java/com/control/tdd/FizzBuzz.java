package com.control.tdd;

public class FizzBuzz {
    public static String FizzBuzz_de(int nbr){
        if(nbr == 3){
            return "Fizz";
        }
        return "" + nbr; // retouner result au lieu de null
    }
}
