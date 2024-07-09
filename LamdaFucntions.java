//THIS FILE IS ABOUT HOW WE WORK WITH THE LAMBDA FUNCTION


package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class LamdaFucntions {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        //THIS IS THE FUNCTION WITH FOR EACH LOOP TO ITERATE OVER THE LIST AND DO GIVE THE EMELEMTS*2;
        list.forEach((item) -> System.out.println(item * 2));


        // SO THE POINT FOR THE LAMDA EXPRESSION IS TO REMOVE RETURN TYPE, NAME, DATA TYPES OF PARAMETA AND RETURE STATEMTNT;
        //THE BELOW FUCNTION ARE FOR THE BASIC MATHMATICAL FUNCTION

        Operation sum = (a,b) -> a + b;
        Operation sub = (a,b) -> a-b;
        Operation mul= (a,b) -> a*b;
        Operation div = (a,b) -> a/b;

        LamdaFucntions myCalculator= new LamdaFucntions();
        System.out.println(myCalculator.operate(2,3,sum));
        System.out.println(myCalculator.operate(6,3,sub));
        System.out.println(myCalculator.operate(2,3,mul));
        System.out.println(myCalculator.operate(2,3,div));
    }
    // HERE OP IS THE INSTALCE FO OPERATION INTERFACE AND IT TAKES 3 PARAMETER
    private  int operate(int a, int b ,Operation op){
        return op.operate(a, b);
    }
}


//THIS INTERFACE IS ALL AOBUT STORING THE VALUES AND BASE LINE FOR CREATING TEH LAMBA EXPRESSION

interface  Operation{
    int operate(int a, int b);
}
