package org.example.level0.p120816;

class Solution {
    public int solution(int slice, int n) {
        return (n % slice == 0) ? (n / slice) : (n / slice + 1);
    }
}