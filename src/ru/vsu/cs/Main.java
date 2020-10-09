package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double r1 = readRadius("Radius1");
        double r2 = readRadius("Radius2");
        double r3 = readRadius("Radius3");

        double x1 = readRadius("ColoredArea x1");
        double x2 = readRadius("ColoredArea x2");

        readFinalArea(calculateFinalArea(r1, r2, r3, x1, x2));
    }

    private static double readRadius(String name)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter %s:  ", name);

        return scan.nextDouble();
    }

    private static double calculateFinalArea(double r1, double r2, double r3, double x1, double x2)
    {
        return searchArea2(r3) * findColoredArea2(x2) + searchArea1(r2,r1) * findColoredArea1(x1);
    }

    private static void readFinalArea(double finalArea)
    {
        System.out.printf("Area = %.3f", finalArea);
    }

    private static double findAreaCircle(double r)
    {
        return Math.PI * r * r;
    }

    private static double findAreaSquare(double r)
    {
        return 2 * r * 2 * r;
    }

    private static double searchArea1(double r2, double r1)
    {
        return findAreaCircle(r2) - findAreaCircle(r1);
    }

    private static double searchArea2(double r3)
    {
        return findAreaSquare(r3) - findAreaCircle(r3);
    }

    private static double findColoredArea1(double x)
    {
        return x / 8;
    }

    private static double findColoredArea2(double x)
    {
        return x / 8;
    }
}