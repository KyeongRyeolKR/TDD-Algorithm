package org.example.level0.p120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10 일 때 => [1, 3, 5, 7, 9]")
    void t1(){
        assertThat(new Solution().solution(10)).isEqualTo(Arrays.asList(1,3,5,7,9));
    }

    @Test
    @DisplayName("15 일 때 => [1, 3, 5, 7, 9, 11, 13, 15]")
    void t2(){
        assertThat(new Solution().solution(15)).isEqualTo(Arrays.asList(1,3,5,7,9,11,13,15));
    }
}
