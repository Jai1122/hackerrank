package com.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int tart = 0;
        int end = tart + k;
        List<String> subs = new ArrayList<>();
        for (int i = tart; end < s.length(); i++) {
            subs.add(s.substring(tart, end));
            tart++;
            end++;
        }
        Collections.sort(subs);
        smallest = subs.get(0);
        largest = subs.get(subs.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
