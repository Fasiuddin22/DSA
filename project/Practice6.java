package project;

import java.util.Scanner;

public class Practice6 {
//    Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value currency in rupees: ");
        double rupees = sc.nextDouble();
        double dollar = rupees * 0.012;
        System.out.println("dollar is " + dollar);
    }
}
