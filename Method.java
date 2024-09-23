import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = sc.nextInt();
//        System.out.println("Enter number: ");
//        int number2 = sc.nextInt();
//        int sum = number + number2;
//        System.out.println("The sum is: " + sum);
        int ans = sum1();
        System.out.println(ans);
    }
    /*
        return type name(){
            //body
            return stmt;
        }

     */
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 =  sc.nextInt();
        System.out.println("Enter number");
        int num2 =  sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum : "+sum);
    }

    static int sum1(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 =  sc1.nextInt();
        System.out.println("Enter number");
        int num2 =  sc1.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
