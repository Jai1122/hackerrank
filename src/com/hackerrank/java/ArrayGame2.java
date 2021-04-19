package com.hackerrank.java;

import java.util.Scanner;

public class ArrayGame2 {

    //TODO Retry this. It is not working
    public static boolean canWin(int leap, int[] game) {
        int n   = game.length;
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            if(pointer+leap >= n-1) return true;
            if(game[pointer+leap] == 0){
                pointer =   pointer+leap;
            }else if(game[pointer+1]==0){
                pointer =   pointer+1;
            }else if(pointer>0 && game[pointer-1]==0){
                pointer =   pointer-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
