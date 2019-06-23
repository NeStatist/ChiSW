package com.company;

import java.util.Scanner;

public class Point {

    Scanner sc = new Scanner(System.in);

    private double X, Y, X2, Y2;
    double a;

    public void set_Point() {
        System.out.println("Enter X1, Y1: ");
        X = sc.nextDouble();
        Y = sc.nextDouble();

        System.out.println("Enter X2, Y2: ");
        X2 = sc.nextDouble();
        Y2 = sc.nextDouble();

    }

    public void movingPointX(){

        System.out.println("Enter where moving X: ");
        a = sc.nextDouble();

        X += a;
        System.out.println("X = " + X);
    }
    public void movingPointY(){

        System.out.println("Enter where moving Y: ");
        a = sc.nextDouble();

        Y += a;
        System.out.println("Y = " + Y);
    }
    public void distToOrd(){

        double r;
        r = Math.sqrt(X*X+Y*Y);
        System.out.println("\nDistance to origin: " + r);
    }

    public void distPtP(){

        double dist;

        dist = Math.sqrt((X- X2)*(X- X2)+(Y - Y2)*(Y - Y2));
        System.out.println("Distance between two points: " + dist);
    }

    public void polar(){

        double Pol,r;
        r = Math.sqrt(X*X+Y*Y);
        Pol = Math.acos(X / r)*180.0 / 3.14;
        System.out.println("Conversion to polar coordinates: " + Pol);
    }
    public void  comparison(){

        if (X == X2 && Y == Y2) {
            System.out.println();
            System.out.println("The points are match up");
        }
        else{
            System.out.println();
            System.out.println("The points do not match");
        }
    }
}
