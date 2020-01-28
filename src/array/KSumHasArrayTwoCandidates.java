package array;

import java.util.Arrays;


/*
Approach:

1) Sort the array in non-decreasing order.
2) Initialize two index variables to find the candidate
   elements in the sorted array.
       (a) Initialize first to the leftmost index: l = 0
       (b) Initialize second  the rightmost index:  r = ar_size-1
3) Loop while l < r.
       (a) If (A[l] + A[r] == sum)  then return 1
       (b) Else if( A[l] + A[r] <  sum )  then l++
       (c) Else r--
4) No candidates in whole array - return 0

OR

Either you can use SumEqualToSumRestArray Approach
*/

public class KSumHasArrayTwoCandidates {

    static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
        int l, r;

        /* Sort the elements */
        Arrays.sort(A);

        /* Now look for the two candidates in the sorted array*/
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum){
                System.out.println("Pair with given sum " + sum + " is (" + A[l] + ", " + A[r] + ")");
                return true;
            }
            else if (A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
        return false;
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        int arr_size = A.length;

        // Function calling
        if (hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Array has two "
                    + "elements with given sum");
        else
            System.out.println("Array doesn't have "
                    + "two elements with given sum");
    }

}
