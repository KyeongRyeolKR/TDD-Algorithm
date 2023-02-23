package org.example.level0.p120889;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[2] < sides[0] + sides[1]) {
            return 1;
        } else {
            return 2;
        }
    }
}