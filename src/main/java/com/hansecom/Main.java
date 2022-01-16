package com.hansecom;


import com.hansecom.data.School;
import com.hansecom.data.Student;

public class Main {

    public static void main(String[] args) {
        School school = new School(213, "Beletskogo 16");

        Student student = new Student("Alisa", 15, school, 9.8);
        student.printStudentData();
        System.out.println("Am I good student? The answer is " + student.isGoodStudent());

        Student student2 = new Student("Vova", 14, school, 7.8);
        student2.printStudentData();
        System.out.println("Am I good student? The answer is " + student2.isGoodStudent());
    }
}
