package com.algorithm.hanoi;

public class TowerOfHanoi {
    public static void main (String[] args){
        hanoi('A', 'B', 'C', 3);
    }
    static void hanoi (char x, char y, char z, int n){
        if (n > 0){
            hanoi(x, z, y, n-1);
            System.out.println(x + " to " + z);
            hanoi(y, x, z, n-1);
        }
    }
}
