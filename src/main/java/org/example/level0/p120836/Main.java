package org.example.level0.p120836;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }
}