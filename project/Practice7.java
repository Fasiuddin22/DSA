package project;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + "\n" + num2);
        for (int i = 2; i < n; i++) {
            int sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
        System.out.print(" ");
    }
}
