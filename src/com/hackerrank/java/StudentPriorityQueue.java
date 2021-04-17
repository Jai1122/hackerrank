package com.hackerrank.java;

import java.util.*;

public class StudentPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        Comparator<Student> comparator = new StudentComparator();
        PriorityQueue queue = new PriorityQueue(events.size(), comparator);
        for (int i = 0; i < events.size(); i++) {
            String event = events.get(i);
            if(event.equals("SERVED")){
                Student polled = (Student)queue.poll();
            }else {
                String[] eventEntry =   event.split(" ");
                queue.add(new Student(Integer.parseInt(eventEntry[3]),eventEntry[1],Double.parseDouble(eventEntry[2])));
                Student peeked = (Student)queue.peek();
            }
        }
        List<Student> result   =   new ArrayList<>(queue.size());
        while(!queue.isEmpty()){
            result.add((Student)queue.poll());
        }
        return result;
    }
}

class Student {
    double cgpa;
    int id;
    String name;

    public Student(int id, String name, double cgpa) {
        this.cgpa = cgpa;
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.cgpa > s2.cgpa) {
            return -1;
        }else if(s1.cgpa < s2.cgpa){
            return 1;
        }else if (s1.cgpa == s2.cgpa) {
            if (s1.name.equals(s2.name)) {
                if (s1.id > s2.id) {
                    return 1;
                }
            } else {
                return  s1.name.compareTo(s2.name);
            }
        }
        return 0;
    }
}
