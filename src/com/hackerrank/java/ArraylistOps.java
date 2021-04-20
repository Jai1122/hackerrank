package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistOps {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int listCount = Integer.parseInt(read.nextLine());
        List<List<Integer>> parentList  =   new ArrayList<>(listCount);
        while(--listCount >= 0){
            String[] listItems  =   read.nextLine().split(" ");
            List<Integer> list  =   new ArrayList<>();
            for (int i = 1; i < listItems.length; i++) {
                list.add(Integer.parseInt(listItems[i]));
            }
            parentList.add(list);
        }
        int queryCount = Integer.parseInt(read.nextLine());
        while (--queryCount >= 0){
            String[] xy = read.nextLine().split(" ");
            int x   =   Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            if(parentList.size() > x-1){
                if(parentList.get(x-1).size() > y-1){
                    System.out.println(parentList.get(x-1).get(y-1));
                }else {
                    System.out.println("ERROR!");
                }
            }else {
                System.out.println("ERROR!");
            }
        }
    }
}
