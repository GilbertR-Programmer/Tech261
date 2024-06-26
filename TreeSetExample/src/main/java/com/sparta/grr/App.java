package com.sparta.grr;

import java.util.TreeSet;

public class App {
    //TreeSet implements navigableSet which implements sortedSet
    //TreeSet should be used when we are accessing large amounts of sorted data that we need to access quickly
    public static void main(String[] args) {
        StudentComparator studentComparator = new StudentComparator();

        TreeSet<Student> studentSet = new TreeSet<>(studentComparator);

        studentSet.add(new Student(91, "Santosh", 85));
        studentSet.add(new Student(31, "Cherry", 71));
        studentSet.add(new Student(87, "David", 82));
        studentSet.add(new Student(52, "Praveen", 91));
        studentSet.add(new Student(34, "Raj", 61));         //Duplicate element
        studentSet.add(new Student(34, "Raj", 61));         //Duplicate element
        studentSet.add(new Student(34, "John", 76));
        studentSet.add(new Student(74, "Peter", 83));
        studentSet.add(new Student(65, "Hari", 52));       //Duplicate element
        studentSet.add(new Student(65, "Hari", 52));       //Duplicate element
        studentSet.add(new Student(99, "Daniel", 89));

        Student passingStudent = new Student(65,"passer",0);

        System.out.println();
        System.out.println("Lowest Passing Student");
        System.out.println(studentSet.ceiling(passingStudent).toString());
        System.out.println();

        System.out.println("Highest Failing Student");
        System.out.println(studentSet.lower(passingStudent).toString());
        System.out.println();

        System.out.println("Passing Students");
        //using tailSet to get the end of the set
        for(Student student : studentSet.tailSet(passingStudent)){
            System.out.println(student.toString());
        }

        System.out.println();
        System.out.println("FailingStudents");
        //using headSet to get the front or head of the set
        for(Student student : studentSet.headSet(passingStudent)){
            System.out.println(student.toString());
        }

        System.out.println();
        System.out.println(studentSet.pollLast().toString());
        System.out.println(studentSet.pollFirst().toString());



    }
}
