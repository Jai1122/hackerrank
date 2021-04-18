package com.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerOps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger b1 = new BigInteger(scan.nextLine());
        BigInteger b2 = new BigInteger(scan.nextLine());
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
