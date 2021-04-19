package com.hackerrank.java;

import java.util.*;

public class DequeueOps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set    =   new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique   =   Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if(deque.size() == m) {
                if (set.size() > maxUnique) maxUnique = set.size();
                int first = deque.poll();
                if(!deque.contains(first)) set.remove(first);
            }
        }
        System.out.println(maxUnique);
    }
}
