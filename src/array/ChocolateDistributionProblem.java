package array;

import java.util.Arrays;

/*
*
Chocolate Distribution Problem

Given an array of n integers where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates. There are m students, the task is to distribute
chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in packet with maximum
chocolates and packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
m = 3
Output: Minimum Difference is 2
We have seven packets of chocolates and
we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum
difference between maximum and minimum packet
sizes.
*/

public class ChocolateDistributionProblem {

    static int findMinDiff(int arr[], int n,  int m) {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;

        // Sort the given packets
        Arrays.sort(arr);

        // Number of students cannot be
        // more than number of packets
        if (n < m)
            return -1;

        // Largest number of chocolates
        int min_diff = Integer.MAX_VALUE;

        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
        int first = 0, last = 0;
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff)
            {
                min_diff = diff;
                first = i;
                last = i + m - 1;
            }
        }
        return (arr[last] - arr[first]);
    }


    public static void main(String[] args)  {

        int arr[] =  {7, 3, 2, 4, 9, 12, 56};

        int m = 3;  // Number of students

        int n = arr.length;
        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));

    }
}
