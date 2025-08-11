package org.example;

public class Main {
    public static void changeStudentName(Student student, String name) {
        student.name = name;
    }

    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.name = "Alex";
        System.out.println("Name before change: " + myStudent.name);
        changeStudentName(myStudent, "John");
        System.out.println("Name after change: " + myStudent.name);
    }
}