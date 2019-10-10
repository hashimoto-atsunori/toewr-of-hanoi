package com.algorithm.hanoi;

public class TowerOfHanoi {
    public static void main (String[] args){
        hanoi('A', 'B', 'C', 3);
    }
    static void hanoi (char a, char b, char c, int n){
        int count = 0;
        if (n > 0){
            count++;
            hanoi(a, c, b, n-1);
            System.out.println(String.valueOf(count) + a + " to " + c);
            hanoi(b, a, c, n-1);
        }
    }
}
