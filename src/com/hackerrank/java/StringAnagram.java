package com.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar,bChar);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
