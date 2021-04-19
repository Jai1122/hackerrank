package com.hackerrank.java;

import java.util.*;

public class SortStudentWithComparator {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<SortStudent> studentList = new ArrayList<SortStudent>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            SortStudent st = new SortStudent(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<SortStudent> sortStudentComparator   =   new Comparator<SortStudent>() {
            @Override
            public int compare(SortStudent o1, SortStudent o2) {
                if(o1.getCgpa() == o2.getCgpa()){
                    if(o1.getFname().equals(o2.getFname())){
                        return o1.getId()  > o2.getId()? -1:1;
                    }else {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                }else {
                    return o1.getCgpa()  > o2.getCgpa()? -1:1;
                }
            }
        };

        Collections.sort(studentList,sortStudentComparator);

        for(SortStudent st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class SortStudent{
    private int id;
    private String fname;
    private double cgpa;
    public SortStudent(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
