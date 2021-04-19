package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOps {

    //TODO Worked for default case only
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n   =   read.nextInt();
        read.nextLine();
        List<Integer> inputList =   new ArrayList<>(n);
        String inputVal = read.nextLine();
        String[] inputnums  =   inputVal.split(" ");
        for (int i = 0; i < n; i++) {
            inputList.add(Integer.parseInt(inputnums[i]));
        }
        int queryCount = read.nextInt();
        read.nextLine();
        while (queryCount-- > 0){
            String opn  =   read.nextLine();
            if(opn.equals("Insert")){
                String query = read.nextLine();
                int index = Integer.parseInt(query.split(" ")[0]);
                int val = Integer.parseInt(query.split(" ")[1]);
                inputList.add(index,val);
            }else if(opn.equals("Delete")){
                int index = read.nextInt();
                read.nextLine();
                inputList.remove(index);
            }
        }
        for (int num:inputList){
            System.out.print(num+" ");
        }
    }
}
