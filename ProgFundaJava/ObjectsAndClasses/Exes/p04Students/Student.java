package ObjectsAndClasses.Exes.p04Students;

import java.util.Scanner;

public class Student {
    private String name;
    private String lastName;
    private  double grade;

    // конструктор

    public Student (String name, String lastName, double grade){

        //нов обект

        this.name = name;
        this.lastName = lastName;
        this.grade = grade;


    }

    public double getGrade() {
        return this.grade;
    }

    public String toString(){

        return String.format("%s %s: %.2f", this.name, this.lastName,this.grade);

    }
}
