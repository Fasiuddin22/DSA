package project;
import java.util.Scanner;
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation + or - or * or / : ");
        String op = sc.next();
        if(op.equals("+")){
            System.out.println(a + b);
        }
        else if(op.equals("-")){
            System.out.println(a - b);
        }
        else if(op.equals("*")){
            System.out.println(a * b);
        }
        else if(op.equals("/")){
            System.out.println(a / b);
        }
        else{
            System.out.println("Invalid operation");
        }
    }
}