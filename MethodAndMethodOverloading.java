// import java.util.Scanner;
public class MethodAndMethodOverloading {
    public static int add(int a, int b)
    {
        int sum = 0;
        sum = a+b;
        return sum;
    }

    public static int add(int a, int b, int c) 
    {
        int sum = 0;
        sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Methods");

        int x = 2;
        int y = 3;
        int z = 5;
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        int result;
        // result = add(x, y);
        result = add(x, y,z);
        System.out.println(result);
    }
    
}
