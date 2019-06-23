package com.company;

import java.util.Scanner;

public class Angle {

    Scanner sc = new Scanner(System.in);

    private double a1, a2;

    public void set_a() {
        a1 = sc.nextDouble();
        a2 = sc.nextDouble();
    }

    public void Radian () {

        double radian = a1 * Math.PI / 180;

        System.out.println("Radians = " + radian);
    }

    public void Range () {

        double range = a1 % 360;

        System.out.println("Range = " + range);

    }
    public void increment () {

        double incrementDegree;

        System.out.println("Enter increment: ");

        incrementDegree = sc.nextByte();
        a1 += incrementDegree;

        System.out.println("Increment Degree = " + a1);
    }

    public void  decrement () {

        double decrementDegree;

        System.out.println("Enter decrement: ");

        decrementDegree = sc.nextByte();
        a1 -= decrementDegree;

        System.out.println("Decrement Degree = " + a1);
    }

    public  void  sum () {

        double result;

        result = a1 + a2;
        System.out.println("Result sum two Angles = " + result);
    }

    public  void  sub () {

        double result;

        result = a1 - a2;
        System.out.println("Result subtarct two Angles = " + result);
    }
    public void sin() {

        double radian = a1 * Math.PI / 180;
        double sin = Math.sin(radian);

        System.out.println("Sinus angle1 = " + sin);
    }


    public void equals(){
        if (a1 == a2){
            System.out.println("Angles are equal");
        }
        else {
            System.out.println("Angles is not equal");
        }
    }
}
