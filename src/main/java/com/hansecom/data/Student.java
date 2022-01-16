package com.hansecom.data;


public class Student {
    private String name;
    private int age;
    private School school;
    private double avScore;


    public Student(String name, int age, School school, double avScore) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.avScore = avScore;
    }

    public void printStudentData() {
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am studying at school " + school.number + "," + " which is located - " + school.address);
    }

    public boolean isGoodStudent() {
        if (this.avScore > 9) {
            return true;
        }
        return false;
    }
}
