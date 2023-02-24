package org.example.level0.p120836;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("20이 전달될 때 => 6")
    void t1(){
        assertThat(new Solution().solution(20)).isEqualTo(6);
    }

    @Test
    @DisplayName("100이 전달될 때 => 9")
    void t2(){
        assertThat(new Solution().solution(100)).isEqualTo(9);
    }
}
