package array;


/*
Approach Initialize:
    max_so_far = 0
    max_ending_here = 0

    Loop for each element of the array
    (a) max_ending_here = max_ending_here + a[i]
    (b) if(max_ending_here < 0)
    max_ending_here = 0
    (c) if(max_so_far < max_ending_here)
    max_so_far = max_ending_here
    return max_so_far
*/
public class LargestSumContiguousSubarray {

    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int[] a){
        int max_sum =0, max_ending_sum=0;

        for(int val : a){
            max_ending_sum = max_ending_sum + val;
            if(max_ending_sum < 0){
                max_ending_sum = 0;
            }

            if(max_sum < max_ending_sum){
                max_sum = max_ending_sum;
            }

        }
        return max_sum;
    }
}
