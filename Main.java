//THIS CODE SHOWS HOW COMPARATOR WORKS IN JAVA ;
//WE HAVE A MAIN CLASS AND STUDENT CLASS IMPLEMENTS COMPARABLE INTERFACE WIHT GENERIC DATA TYPE
package org.example;


import java.nio.IntBuffer;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args)
    {
        Student Bhuwan = new Student(2,"Bhuwan",34.34);
        Student Ram = new Student(4,"Rahul",55.67);


        if(Bhuwan.compareTo(Ram)< 0){
            System.out.println(Bhuwan.compareTo(Ram));
            System.out.println("Bhuwan got the lessser marks");
        }

    }
}

class  Student implements  Comparable<Student>{
    int RollNO;
    String name;
    double marks;


    public Student(int rollNO, String name,double marks) {
        RollNO = rollNO;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        //COMAPRING THE MARKS OF BHUWAN AND MARKS OF RAHUL
        int diff = (int)(this.marks - o.marks) ;
        return diff;
    }
}