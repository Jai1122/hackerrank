package com.hackerrank.java;

import java.util.Scanner;

public class TwoDArrayHourglass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            int add = 0;
            for (int j = 1; j < 5; j++) {
                add = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                maxNum = Math.max(maxNum, add);
            }
        }
        System.out.println(maxNum);
        scanner.close();
    }
}
