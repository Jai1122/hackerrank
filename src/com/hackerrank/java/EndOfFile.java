package com.hackerrank.java;

import java.util.Scanner;

public class EndOfFile {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i=1;
        while(sc.hasNextLine()){
            System.out.println(i + " "+sc.nextLine());
            i++;
        }
    }
}
