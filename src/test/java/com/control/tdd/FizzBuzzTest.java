package com.control.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    @ParameterizedTest
    @CsvSource({"1,1",
            "2,2","3,Fizz","5,Buzz","18,Fizz","25,Buzz","30,FizzBuzz"})
    void FizzBuzzparam(int in,String r) {
        String result = FizzBuzz.FizzBuzz_de(in);
        assertThat(result).isEqualTo(r);
    }
}
