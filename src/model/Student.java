package model;

import java.util.ArrayList;

public class Student {
    String name;
    String active;
//    String[] grades;
    ArrayList<String> grades = new ArrayList<String>();


    public Student(String name, String active) {
        this.name = name;
        this.active = active;
    }
}


