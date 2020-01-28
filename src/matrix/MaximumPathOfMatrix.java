package matrix;

import static java.lang.StrictMath.max;


/*
Input : mat[][] =   10 10  2  0   20  4
                    1  0   0  30  2   5
                    0  10  4  0   2   0
                    1  0   2  20  0   4
Output : 74
The maximum sum path is 20-30-4-20.

Explain:
        10 10  2   0   20  4
        11 10  10  50  22  25
        11 21  54  50  52  22
        22 54  56  74  53  26
*/

public class MaximumPathOfMatrix {

    static int N = 4, M = 6;


    public static void main (String[] args)
    {
        int mat[][] = {
                { 10, 10, 2, 0,  20, 4 },
                { 1,  0,  0, 30, 2,  5 },
                { 0,  10, 4, 0,  2,  0 },
                { 1,  0,  2, 20, 0,  4 }
        };
        System.out.println(findMaxPath(mat));
    }

    public static int findMaxPath(int[][] mat){
        int res =-1;
        for (int i = 0; i < M; i++)
            res = max(res, mat[0][i]);

        for (int i = 1; i < N; i++)
        {
            res = -1;
            for (int j = 0; j < M; j++)
            {
                // When all paths are possible
                if (j > 0 && j < M - 1)
                    mat[i][j] += max(mat[i - 1][j], max(mat[i - 1][j - 1], mat[i - 1][j + 1]));

                    // When diagonal right is not possible
                else if (j > 0)
                    mat[i][j] += max(mat[i - 1][j], mat[i - 1][j - 1]);

                    // When diagonal left is not possible
                else if (j < M - 1)
                    mat[i][j] += max(mat[i - 1][j], mat[i - 1][j + 1]);

                // Store max path sum
                res = max(mat[i][j], res);
            }
        }
        return res;
    }
}
