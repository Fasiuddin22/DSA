package project;

import java.util.Scanner;

public class Practic9 {
//    To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {

                int i1 = n % 10;
                sum = sum + (i1*i1*i1) ;
                n = n / 10;
            }
                if(i == sum){
                    System.out.println(i);
            }

        }
    }


}
