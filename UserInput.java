// import java.util.Scanner;
// public class UserInput {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         String name = sc.nextLine();
//         System.out.println(name);

//      }
// }

import java.util.Scanner;
public class UserInput {
    // Enter Your Methods Here
    public static void main(String[] args) {
        System.out.println( "Enter your marks" );
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();
        System.out.println("Your Marks is: " + sub1);
        System.out.println(sub2);
        System.out.println(sub3);
        System.out.println(sub4);
        System.out.println(sub5);
    }
}