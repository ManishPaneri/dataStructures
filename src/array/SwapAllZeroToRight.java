package array;

import java.util.ArrayList;

public class SwapAllZeroToRight {

    public static void main (String[] args)
    {
        int [] a = {0, 0, 4, -1, 0, 1, 5, -3};
       for(int val : pushZeroToEnd(a, a.length)){
           System.out.print(val+" ");
       }
    }

        static  int[] pushZeroToEnd(int[] arr,int n){
        int count=0;
        for(int val : arr){
            if(val != 0){
                arr[count]=val;
                count++;
            }
        }

        while (count < n){
            arr[count]=0;
            count++;
        }
        return arr;
    }

}
