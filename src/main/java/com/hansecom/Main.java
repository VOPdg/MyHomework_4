package com.hansecom;

import com.hansecom.data.Alisa;
import com.hansecom.data.Director;

public class Main {

    public static void main(String[] args) {
        Alisa alisa = new Alisa();
        Director director= new Director();
        if(alisa.getIsStudent()){
        System.out.println("Will graduate school: "+ (alisa.getAge() + 2));
        System.out.println("The student Name: "+alisa.getName());
        System.out.println("The avg score: "+alisa.getAvgScore());}
        if(!director.getIsStudent()){
            System.out.println("Age: "+ director.getAge());
            System.out.println("The Name: "+director.getName()); }


    }
}
