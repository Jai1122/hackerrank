package com.hackerrank.java;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetOperation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int N   =   Integer.parseInt(input.split(" ")[0]);
        int M   =   Integer.parseInt(input.split(" ")[1]);
        BitSet b1   =   new BitSet(N);
        BitSet b2   =   new BitSet(N);

        for(int i=0;i<M;i++){
            String[] op = reader.nextLine().split(" ");
            int op1 = Integer.parseInt(op[1]);
            int op2 = Integer.parseInt(op[2]);
            switch(op[0]){
                case "AND": if(op1 == 1){
                    b1.and(b2);
                }else{
                    b2.and(b1);
                }
                    break;
                case "OR":  if(op1 == 1){
                    b1.or(b2);
                }else{
                    b2.or(b1);
                }
                    break;
                case "XOR": if(op1 == 1){
                    b1.xor(b2);
                }else{
                    b2.xor(b1);
                }
                    break;
                case "FLIP":if(op1 == 1){
                    b1.flip(op2);
                }else{
                    b2.flip(op2);
                }
                    break;
                case "SET": if(op1 == 1){
                    b1.set(op2);
                }else{
                    b2.set(op2);
                }
                    break;
                default: System.out.println("Invalid Operation");
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
