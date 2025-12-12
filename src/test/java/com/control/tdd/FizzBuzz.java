package com.control.tdd;

public class FizzBuzz {
    public static String FizzBuzz_de(int nbr){
        if(nbr % 3 == 0){
            return "Fizz";
        }
        else if(nbr == 5){
            return "Buzz";
        }
        return "" + nbr; // retouner result au lieu de null
    }
}
