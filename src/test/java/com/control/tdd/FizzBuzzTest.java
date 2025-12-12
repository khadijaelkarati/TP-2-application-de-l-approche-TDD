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
}