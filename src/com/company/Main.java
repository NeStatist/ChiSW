package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N;

        Triangle Tri = new Triangle();
        Angle Ang = new Angle();
        Point Poi = new Point();
        Rational Ration = new Rational();

        Scanner sc = new Scanner(System.in);


        System.out.println("Select class to work: " +
                "\n1.Triangle;" +
                "\n2.Angle;" +
                "\n3.Point;" +
                "\n4.Rational." +
                "\n");

        N = sc.nextInt();

        switch(N){
            case 1:

                System.out.println("Enter 3 sides of triangle: ");
                Tri.set_s();

                System.out.println("Enter 3 angles of triangle: ");
                Tri.set_a();

                Tri.square();
                Tri.perimeter();
                Tri.height();
                Tri.triangle();

                break;

            case 2:

                System.out.println("Enter angle1 and angle that you will compare: ");
                Ang.set_a();

                Ang.Radian();
                Ang.Range();
                Ang.increment();
                Ang.decrement();
                Ang.sum();
                Ang.sub();
                Ang.sin();
                Ang.equals();

                break;

            case 3:
                System.out.println("Enter 2 points:");
                Poi.set_Point();

                Poi.movingPointX();
                Poi.movingPointY();
                Poi.distToOrd();
                Poi.distPtP();
                Poi.polar();
                Poi.comparison();

                break;

            case 4:

                Ration.set_Numbers();
                Ration.add();
                Ration.sub();
                Ration.mul();
                Ration.div();
                Ration.equalsD();
                Ration.greate();
                Ration.less();

                break;
        }

    }
}
