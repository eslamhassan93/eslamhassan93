package com.sprint.com;

import java.util.Scanner;

public class main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String firstname="";
        System.out.println("please enter the firstname ");
        firstname = input.next();
        System.out.println("your first name is");

        System.out.println(2+3*5);
        System.out.println((2+3)*5);
        System.out.println((10*5124)+10);
        System.out.println(5.0/2);
       int i=9,j=2;
        System.out.println( (float) i/j);
        i+=5;

        int x=15, y=7;
        System.out.println((float) x/y);
        //i++;
        //j++;
        //x--;
        //y--;
        j*=5; //compound assignment


        System.out.println(i);
        System.out.println(j);

        System.out.println(y);
        //i--;
        //j--;
        //System.out.println(i++);
        //System.out.println(++j);

        int a=4 ,b=8;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(a--);
        System.out.println(a);



    }
}
