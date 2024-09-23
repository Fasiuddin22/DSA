
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String firstName = in.nextLine();
        System.out.print("Enter Your Last Name: ");
        String lastName = in.nextLine();
        System.out.print("Enter Your Age: ");
        int age = in.nextInt();
        System.out.print("Enter Your Gender: ");
        String gender = in.nextLine();
        System.out.print("Enter Your Address: ");
        String address = in.nextLine();
        System.out.print("Enter Your City: ");
        String city = in.nextLine();
        System.out.print("Enter Your State: ");
        String state = in.nextLine();
        System.out.println(firstName);
    }
}
