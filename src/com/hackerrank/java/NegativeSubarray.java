package com.hackerrank.java;

import java.util.Scanner;

public class NegativeSubarray {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n   =   Integer.parseInt(in.nextLine());
        int[] a =   new int[n];
        for (int i = 0; i < n; i++) {
            a[i]    = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+=a[j];
                if (sum<0) count++;
            }
        }

        System.out.println(count);
    }
}
