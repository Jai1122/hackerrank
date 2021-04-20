package com.hackerrank.java;

import java.util.Scanner;
import java.util.Stack;

public class StackOps {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Stack<Character> stack =   new Stack<>();
            String input=sc.next();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                    stack.push(input.charAt(i));
                } else if (input.charAt(i) == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(input.charAt(i));
                        break;
                    }
                } else if (input.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(input.charAt(i));
                        break;
                    }
                } else if (input.charAt(i)== ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(input.charAt(i));
                        break;
                    }
                }
            }
            if (stack.empty()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}
