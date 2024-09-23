package project;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount & Rate of Interest & Time : ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double Si = (p * r * t) / 100;
        System.out.println("Simple interest is " + Si);

    }
}
