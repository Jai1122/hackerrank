package com.hackerrank.java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class TagContentExtractor {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases-- > 0) {
            String line = scan.nextLine();

            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }

    private static void attempt1(){
        Scanner in = new Scanner(System.in);
        List<String> validString = new ArrayList<>();
        Stack<String> tags = new Stack<>();
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            char[] inputchar = line.toCharArray();
            StringBuilder thisLine = new StringBuilder();
            for (int i = 0, j = 0; i < inputchar.length && j < inputchar.length; i++) {
                if (inputchar[j] == '<' && inputchar[j + 1] != '/') {
                    StringBuilder starttagNameString = new StringBuilder();
                    while (inputchar[++j] != '>') {
                        starttagNameString.append(inputchar[j]);
                    }
                    tags.push(starttagNameString.toString().toLowerCase());
                    j++;
                    if(thisLine.length() != 0){
                        validString.add(thisLine.toString());
                        thisLine    = new StringBuilder();
                    }
                    continue;
                } else if (inputchar[j] == '<' && inputchar[j + 1] == '/') {
                    j=j+2;
                    StringBuilder endtagNameString = new StringBuilder();
                    while (inputchar[j] != '>') {
                        endtagNameString.append(inputchar[j++]);
                    }
                    String endTagName = endtagNameString.toString().toLowerCase();
                    if (tags.peek().equals(endTagName)) {
                        tags.pop();
                        j++;
                        continue;
                    } else {
                        out.println("Invalid Tag " + endTagName);
                        validString.add("None");
                        break;
                    }
                } else {
                    thisLine.append(inputchar[j++]);
                }
            }
            if (tags.isEmpty()) {
                validString.add(thisLine.toString());
            }
            testCases--;
        }
        for (String content : validString) {
            out.println(content);
        }
    }
}
