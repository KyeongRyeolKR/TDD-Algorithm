package org.example.level0.p120824;

class Solution {
    public int[] solution(int[] num_list) {

        int[] result = new int[2];

        for(int x : num_list){
            if(x % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }

        return result;
    }
}