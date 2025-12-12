package com.control.tdd;

public class FizzBuzz {
    public static String FizzBuzz_de(int nbr) {
        if (nbr % 3 == 0 && nbr %5 == 0) {
            return "FizzBuzz";
        }
        else if (nbr % 3 == 0) {
            return "Fizz";
        } else if (nbr % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(nbr);
    }
}
