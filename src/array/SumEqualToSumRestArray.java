package array;

import java.util.HashSet;

/*
Approach:

1- Find the sum of whole array. Let this sum be “sum”
2- If sum is odd, return false.
3- Find a pair with sum equals to “sum/2” using hashing based method discussed here as method 2. If a pair is found, print it and return true.
4- If no pair exists, return false.
*/

public class SumEqualToSumRestArray {

        public static void main(String[] args) {
            int arr[] = {2, 5,11, 1, 4, 7};
            int n = arr.length;
            if (checkPair(arr, n) == false) {
                System.out.printf("No pair found");
            }

        }

    private static boolean checkPair(int arr[], int n) {
        //Find the sum of whole array
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }

        // If sum of array is not even than we can not
        // divide it into two part
        if (sum % 2 != 0) {
            return false;
        }

        sum = sum / 2;

        // For each element arr[i], see if there is
        // another element with value sum - arr[i]
        HashSet<Integer> s = new HashSet<>();
        for (int index = 0; index < n; index++) {
            int val = sum - arr[index];

            // If element exist than return the pair
            if (s.contains(val) && val == (int) s.toArray()[s.size() - 1]) {
                System.out.printf("Pair elements are %d and %d\n", arr[index], val);
                return true;
            }
            s.add(arr[index]);
        }

        return false;
    }

}