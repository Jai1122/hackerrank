package com.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerOps1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInt   =   new BigInteger(n);
        if(bigInt.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        scanner.close();
    }
}
