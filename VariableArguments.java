public class VariableArguments {
    static public int add(int ...a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        // for(int i = 0; i < a.length; i++)
        // {
        //     sum += a[i];
        //     System.out.println("The sum is on " + i + " is: " + sum);
        // }
        // for(int b : a)
        // {
        //     sum += b;
        // }
        return sum;
    }
    public static void main(String[] args) {
     System.out.println("Variable Arguments"); 
    //  int result;
    //  result = add(2, 3,5,6);
    //  System.out.println(result);
    add(2,3,4);
    }
}
