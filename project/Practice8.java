package project;

import java.util.Scanner;

public class Practice8 {
//    To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sting to check whether it is pallindrome or not: ");
        String number = sc.nextLine();
        String temp = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            temp = temp + number.charAt(i);
        }
        if (number.equals(temp)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

