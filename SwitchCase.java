
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age)
        {
            case 10:
            System.out.println("Age is 10");
            break;
            case 20:
            System.out.println("Age is 20");
            break;
            case 30:
            System.out.println("Age is 30");
            break;
            case 40:
            System.out.println("Age is 40");
            break;
            default:
            System.out.println("Invalid Age");
        }

    }
}
