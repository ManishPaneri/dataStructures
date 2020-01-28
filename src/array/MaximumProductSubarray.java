package array;


import java.util.Arrays;

/*
    Input: arr[] = {6, -3, -10, 0, 2}
    Output:   180
    // The subarray is {6, -3, -10}
*/
public class MaximumProductSubarray {

    // Utility functions to get minimum of two integers
    static int min(int x, int y) { return x < y ? x : y; }

    // Utility functions to get maximum of two integers
    static int max(int x, int y) { return x > y ? x : y; }

    static int maxSubarrayProduct(int arr[]){
        int max_far=0, max=1, min=1;
        int flag =0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]>0){
                max = max * arr[i];
                min = min(min * arr[i], 1);
                flag = 1;

            }else if(arr[i]==0){
                max = 1;
                min = 1;

            }else{
                int temp = max;
                max  = max(min  * arr[i], 1);
                min  = temp * arr[i];
            }

            if (max_far < max )
                max_far = max ;

        }

        if (flag == 0 && max_far == 1)
            return 0;

        return max_far;

    }


    public static void main(String[] args)
    {

        int arr[] = {6, -3, -10, 0, 2};
        System.out.println("Maximum Sub array product is "+ maxSubarrayProduct(arr));
    System.out.println(max(arr));

    }

   static int max(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        int result = Integer.MIN_VALUE;
        int temp[]= {0,0,0};
        for (int i = 1; i < arr.length ; i++)
        {
            temp[0] = min * arr[i];
            temp[1] = max * arr[i];
            temp[2] = arr[i];
            Arrays.sort(temp);
            min = temp[0];
            max = temp[temp.length-1];

            if (max > result)
            {
                result = max;
            }
        }
        return result;
    }
}
