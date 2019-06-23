package com.company;

import java.util.Scanner;

public class Triangle {

    Scanner sc = new Scanner(System.in);

    private double a1, a2, a3, s1, s2, s3;

    public void set_s(){

        s1 = sc.nextByte();
        s2 = sc.nextByte();
        s3 = sc.nextByte();

    }

    public void set_a(){

        a1 = sc.nextByte();
        a2 = sc.nextByte();
        a3 = sc.nextByte();
    }

    public void square () {

        double square, P;

        P = (s1 + s2 + s3)/2;
        square = Math.sqrt(P *(P - s1) * (P - s2) * (P - s3));

        if (square == 0)
            System.out.println("Triangle doesn't exist");

        else
            System.out.println("Square = " + square);
    }

    //вычисление периметра
    public void perimeter () {

        double perimeter;
        perimeter = s1+s2+s3;
        System.out.println("Perimeter = " + perimeter);

    }
    //вычисление высот
    public void height () {
        double h1, h2, h3, P;

        P = (s1+s2+s3)/2;

        h1 = Math.sqrt(4*P*((P - s1)*(P - s2)*(P - s3))/(s1 * s1));
        h2 = Math.sqrt(4*P*((P - s1)*(P - s2)*(P - s3))/(s2 * s2));
        h3 = Math.sqrt(4*P*((P - s1)*(P - s2)*(P - s3))/(s3 * s3));
        System.out.println("Height: \n " +
                "H1 = " + h1 +
                "\n H2 = " + h2 +
                "\n H3 = " + h3);
    }
    //вид треугольника
    public void triangle (){
        if ((s1 == s2) && (s2 == s3))

            System.out.println("\nEquilateral triangle");
        else
        {
            if ((s1 == s2) || (s2 == s3) || (s3 == s1))

                System.out.println("Isosceles triangle");
            else
            {
                if ((a1==90)||(a2==90)||(a3==90))

                    System.out.println("Right triangle");
            }
        }
    }

}

