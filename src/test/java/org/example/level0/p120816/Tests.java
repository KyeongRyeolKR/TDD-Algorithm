package org.example.level0.p120816;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("7, 10 일 때 => 2")
    void t1(){
        assertThat(new Solution().solution(7,10)).isEqualTo(2);
    }

    @Test
    @DisplayName("4, 12 일 때 => 3")
    void t2(){
        assertThat(new Solution().solution(4,12)).isEqualTo(3);
    }

    @Test
    @DisplayName("5, 23 일 때 => 5")
    void t3(){
        assertThat(new Solution().solution(5,23)).isEqualTo(5);
    }
}
