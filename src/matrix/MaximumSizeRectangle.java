package matrix;

/*
Input : 0 1 1 0
        1 1 1 1
        1 1 1 1
        1 1 0 0

Output :  1 1 1 1
          1 1 1 1

Explain:
        0 1 1 0
        1 2 2 1
        2 3 3 2
        3 4 0 0
*/

public class MaximumSizeRectangle {

    public static int findMaximunSizeRectangle(int[][] matrix, int m , int n){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                if(matrix[i][j] == 1 && i != 0){
                    matrix[i][j]  +=matrix[i-1][j];
//                    System.out.print(matrix[i][j]);
                }
            }
//            System.out.println("\n");
        }

        int max = 0;
        for(int i = 0; i < m; i++){
            int rowmax = 0;
            for(int j = 0; j < n ; j++){
                System.out.print(matrix[i][j]);
                rowmax += matrix[i][j];
            }
            System.out.println("\n");
            if(max < rowmax){
                max = rowmax;
            }
        }

        return max;

    }

    // Driver code
    public static void main (String[] args)
    {
        int R = 4;
        int C = 4;

        int A[][] = {
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}
        };
        System.out.print("Area of maximum rectangle is " +
                findMaximunSizeRectangle(A, C, R));
    }
}
