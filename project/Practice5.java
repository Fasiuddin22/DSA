package project;

import java.util.Scanner;

public class Practice5 {
//    Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two input: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        System.out.println("The largest number is : "+ Integer.max(num1, num2));

        if(num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 < num2) {
            System.out.println(num2 + " is less than " + num1);
        }
        else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }

}

