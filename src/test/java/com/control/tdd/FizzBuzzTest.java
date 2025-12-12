package com.control.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void FizzBuzz_de_1(){
        String result = FizzBuzz.FizzBuzz_de(1);
        assertThat(result).isEqualTo("1");
    }
    @Test
    void FizzBuzz_de_3(){
        String result = FizzBuzz.FizzBuzz_de(3);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    void FizzBuzz_de_5(){
        String result = FizzBuzz.FizzBuzz_de(5);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    void FizzBuzz_de_6(){
        String result = FizzBuzz.FizzBuzz_de(6);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    void FizzBuzz_de_10(){
        String result = FizzBuzz.FizzBuzz_de(10);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    void FizzBuzz_de_15(){
        String result = FizzBuzz.FizzBuzz_de(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
