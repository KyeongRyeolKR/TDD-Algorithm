package org.example.level0.p120826;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("\"abcdef\", \"f\" 일 때 => \"abcde\"")
    void t1(){
        assertThat(new Solution().solution("abcdef", "f")).isEqualTo("abcde");
    }

    @Test
    @DisplayName("\"BCBdbe\", \"B\" 일 때 => \"Cdbe\"")
    void t2(){
        assertThat(new Solution().solution("BCBdbe", "B")).isEqualTo("Cdbe");
    }
}
