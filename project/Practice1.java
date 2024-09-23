package project;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check whether it is even or odd: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("its even number");
        }
        else{
            System.out.println("its odd number");
        }
    }
}
