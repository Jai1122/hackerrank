package com.hackerrank.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOpn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());

        try {
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e);
        }
    }
}
