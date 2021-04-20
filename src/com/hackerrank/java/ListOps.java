package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOps {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int listSize   =   Integer.parseInt(read.nextLine());
        List<Integer> list  =   new ArrayList<>(listSize);
        String[] listItems    =   read.nextLine().split(" ");
        for (int i = 0; i < listItems.length && i<listSize; i++) {
            list.add(Integer.parseInt(listItems[i]));
        }
        int queryCount = Integer.parseInt(read.nextLine());
        while (--queryCount >= 0){
            String  opn = read.nextLine();
            if (opn.equals("Insert")){
                String[]  query = read.nextLine().split(" ");
                int x = Integer.parseInt(query[0]);
                int y = Integer.parseInt(query[1]);
                list.add(x,y);
            }else if(opn.equals("Delete")){
                int x = Integer.parseInt(read.nextLine());
                if(list.size() > x){
                    list.remove(x);
                }else {
                    System.out.println("Invalid Index"+x);
                }
            }else {
                System.out.println("Invalid Operation "+opn);
            }
        }
        for (Integer i:list){
            System.out.print(i+" ");
        }
    }
}
