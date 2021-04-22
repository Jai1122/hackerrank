package com.hackerrank.java;

import java.util.Scanner;

public class ExceptionHandlingOne {
    public static final My_Calculator my_calculator = new My_Calculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class My_Calculator {
    /*
     * Create the method long power(int, int) here.
     */

    long power(int n, int p) throws Exception {
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }else if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }else{
            return (long)Math.pow(n,p);
        }
    }

}
