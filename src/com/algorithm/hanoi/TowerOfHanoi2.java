package com.algorithm.hanoi;

public class TowerOfHanoi2 {
     private static int count;
     private static int TARGET_NUMBER = 3;

     // ハノイの塔
     // n : 移動させる円盤の枚数
     // from : 移動元の塔
     // work : 作業用の塔 ---> 一番下の円盤以外の一時的な置き場所
     // dest : 移動先の塔
     private static void hanoi(int n, String from, String work, String dest) {
         System.out.println("            << CALL hanoi(int n,String from,String work,String dest)  -->  hanoi(" + n + " , " + from + " , " + work + " , " + dest + ") >>");
         if (n > 0) {
                 // n - 1 番目の輪を LEFT から CENTER に移動させる。
                 hanoi(n - 1, from, dest, work);
                 // 上の hanoi(n - 1, from, dest, work)を実行完了後に
                 // n 番目の円盤を移動させる。
                 System.out.println(++count + " ： " + n + "番目の円盤を" + from + "から" + dest + "へ移動させる。");
                 // 上の hanoi(n - 1, from, dest, work) メソッドで
                 // 一番下以外の棒がfromからworkに移っているので、
                 // 今度は work を from にして、空いた from を work にして移動させる。
                 // n - 1 番目の輪を CENTER から LEFT に移動させる。
                 hanoi(n - 1, work, from, dest);
             }
     }

     public static void main(String[] args) {
         System.out.println(TARGET_NUMBER + "枚のハノイの塔　開始");
         // ダイアでできた LEFT 塔にある TARGET_NUMBER 枚の純金の円盤をダイアでできた RIGHT 塔に移動させる。
         hanoi(TARGET_NUMBER, "LEFT", "CENTER", "RIGHT");
         System.out.println(TARGET_NUMBER + "枚のハノイの塔　終了");
     }
}
