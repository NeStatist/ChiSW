package com.company;

import java.util.Scanner;

public class Rational {

    private int A, B, C, D, res1, res2;

    Scanner sc = new Scanner(System.in);

    public void set_Numbers() {
        System.out.println("Enter first fraction ");
        System.out.print("Numerator A = ");
        A = sc.nextInt();
        System.out.print("Denominator B = ");
        B = sc.nextInt();

        System.out.println("Enter second fraction ");
        System.out.print("Numerator C = ");
        C = sc.nextInt();
        System.out.print("Denominator D = ");
        D = sc.nextInt();

        if (B == 0 || D == 0){
            System.out.println("Denominator can not be 0!"+
                    "\nTry different values");
            System.exit(0);
        }
    }

    private void reduce() {
        int commonDivisor = greatestCommonDivisor(A, B);
        int commonDivisor2 = greatestCommonDivisor2(C, D);
        A /= commonDivisor;
        B /= commonDivisor;
        C /= commonDivisor2;
        D /= commonDivisor2;
    }

    private int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }

    private int greatestCommonDivisor2(int c, int d) {
        return d == 0 ? c : greatestCommonDivisor2(d, c % d);
    }

    public void add(){

        reduce();
        res1 = A * D + B * C;
        res2 = B * D;
        System.out.println("Sum = " + res1 + "/" + res2);
    }
    public void sub(){

        reduce();
        res1 = A * D - B * C;
        res2 = B * D;
        System.out.println("Sub = " + res1 + "/" + res2);
    }

    public void mul(){

        reduce();
        res1 = A * C;
        res2 = B * D;
        System.out.println("Mul = " + res1 + "/" + res2);
    }

    public void div(){

        reduce();
        res1 = A * D;
        res2 = B * C;
        System.out.println("Div = " + res1 + "/" + res2);
    }

    public void equalsD() {
        if (A == C && B == C){
            System.out.println("Fractions are equal");
        }
        else{
            System.out.println("Fractions are not equal");
        }
    }

    public void greate() {
        if (A * B > C * D){
            System.out.println("First fraction greate");
        }
        else{
            System.out.println("Second fraction greate");
        }
    }

    public void less() {
        if (A * B < C * D){
            System.out.println("First fraction less");
        }
        else{
            System.out.println("Second fraction less");
        }
    }

}

