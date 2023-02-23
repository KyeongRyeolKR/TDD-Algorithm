package org.example.level0.p120825;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}
/*
hello, 3  => hhheeellllllooo
abc, 3    => aaabbbccc
 */
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder builder = new StringBuilder();
        for(char x : my_string.toCharArray()){
            builder.append(String.valueOf(x).repeat(n));
        }
        return builder.toString();
    }
}