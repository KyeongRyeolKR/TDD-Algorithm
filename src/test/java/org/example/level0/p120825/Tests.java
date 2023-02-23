package org.example.level0.p120825;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("\"hello\", 3 일 때 => \"hhheeellllllooo\"")
    void t1(){
        assertThat(new Solution().solution("hello", 3)).isEqualTo("hhheeellllllooo");
    }

    @Test
    @DisplayName("\"abc\", 3 일 때 => \"aaabbbccc\"")
    void t2(){
        assertThat(new Solution().solution("abc", 3)).isEqualTo("aaabbbccc");
    }

    @Test
    @DisplayName("\"abc\", 5 일 때 => \"aaaaabbbbbccccc\"")
    void t3(){
        assertThat(new Solution().solution("abc", 5)).isEqualTo("aaaaabbbbbccccc");
    }
}
