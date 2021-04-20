package com.hackerrank.java;

import java.util.Scanner;

public class OneDArrayIntroduction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] a = new String[n];
        for (int i = 0; i < a.length; i++) {
            a[i]    =   scan.nextLine();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
