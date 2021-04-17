package com.hackerrank.java;

import java.util.Scanner;

public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prev    =   a+b;
            for(int j=0;j<n;j++){
                System.out.print(prev+" ");
                prev = prev + (((int)(Math.pow(2,j+1)))*b);
            }
            System.out.println();
        }
        in.close();
    }
}
