package com.hackerrank.java;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int tart = 0;
        int end = A.length() - 1;
        boolean flag = true;
        while (tart < end) {
            if (A.charAt(tart) == A.charAt(end)) {
                tart++;
                end--;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
