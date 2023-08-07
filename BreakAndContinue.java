public class BreakAndContinue {
    public static void main(String[] args) {
        bahar: for(int i = 0; i < 4; i++)
        {
            andar: for(int j= 0; j<4; j++)
            {
                if(j==2)
                {
                    continue andar;
                }
                System.out.print( i +""+ j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("hi");
    }
}
