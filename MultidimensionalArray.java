public class MultidimensionalArray {
    public static void main(String[] args) {
        // float [][] arr = new float[2][3];
        // arr[0][0] = 1.8f;
        // arr[0][1] = 11.0f;
        // arr[0][2] = 12.6f;
        // arr[1][0] = 13.4f;
        // arr[1][1] = 15.3f;
        // arr[1][2] = 18.3f;
        // int [][] students = {
        //     {1,2,3},
        //     {4,5,6}
        // };
        // System.out.println(students[0][0]);
        // for(int i = 0; i < students.length; i++){ //2
        //     for(int j=0; j < students[i].length; j++) //3
        //     {
        //         System.out.print("{"+students[i][j]+"}");
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        int [][][] arr= {
            {
                {1,2,3},{10,11,12}
            },
            {
                {4,5,6},{13,14,15}
            },
        };

        for(int i = 0; i < arr.length; i++)
        {
             for(int j = 0; j < arr[i].length; j++)
             {
                for(int k = 0; k < arr[j].length; k++)
                {
                    System.out.println(arr[i][j][k]);
                }
             }
        }

        
    }
}
