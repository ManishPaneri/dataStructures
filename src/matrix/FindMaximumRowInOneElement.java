package matrix;


/*
* Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
*
* */
public class FindMaximumRowInOneElement {

    public static void main (String[] args)
    {
        int R = 4;
        int C = 4;

        int Arr[][] = {
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0}
        };
        System.out.print("Matrix row of maximum once are " + findMaxElementOneNumber(Arr,C,R));
    }

    private static int findMaxElementOneNumber(int[][] arr, int m, int n) {
        int maxIndex = 0;
        for(int i=0; i<m ; i++){
            if(arr[i][n-1]!=0){
                int index=n-binarySearchIndex(arr[i], 0, n-1);
                if(maxIndex<index){
                    maxIndex=index;
                }
            }

        }

        return maxIndex;
    }

    private static int  binarySearchIndex(int[] a, int low , int high) {
        if (high < low) {
            return -1;
        }

        if (high == low) {
            return low;
        }

        int mid = low + high / 2;
        if ((mid == 0 || (a[mid - 1] == 0)) && a[mid] == 1) {
            return mid;
        } else if (a[mid] == 0){
            return binarySearchIndex(a, (mid + 1), high);
        } else {
            return binarySearchIndex(a, low, (mid - 1));
        }

    }

}
