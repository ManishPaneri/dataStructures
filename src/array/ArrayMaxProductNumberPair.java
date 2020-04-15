package array;


/*
* Given an array with both +ive and -ive integers, return a pair with highest product.
*
Examples :
Input: arr[] = {1, 4, 3, 6, 7, 0}
Output: {6,7}
Input: arr[] = {-1, -3, -4, 2, 0, -5}
Output: {-4,-5}
*/
public class ArrayMaxProductNumberPair {

    private static void findMaxProductPair(int[] arr, int n) {
        if (n < 2) {
            System.out.println("No pairs exists");
            return;
        }

        if (n == 2) {
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }

        // Iniitialize maximum and second maximum
        int posMax = Integer.MIN_VALUE;
        int posSecMax = Integer.MIN_VALUE;

        // Iniitialize minimum and second minimum
        int negMax = Integer.MIN_VALUE;
        int negSecMax = Integer.MIN_VALUE;

        // Traverse given array
        for (int i = 0; i < n; i++) {
            // Update maximum and second maximum
            // if needed
            if (arr[i] > posMax) {
                posSecMax = posMax;
                posMax = arr[i];
            } else if (arr[i] > posSecMax)
                posSecMax = arr[i];

            // Update minimum and second minimum
            // if needed
            if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(negMax)) {
                negSecMax = negMax;
                negMax = arr[i];
            } else if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(negSecMax))
                negSecMax = arr[i];
        }

        if (negMax * negSecMax > posMax * posSecMax)
            System.out.println("Max product pair is {" + negMax + ", " + negSecMax + "}");
        else
            System.out.println("Max product pair is {" + posMax + ", " + posSecMax + "}");

    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 3, 6, 7, 0};
        int n = arr.length;
        findMaxProductPair(arr, n);
    }
}
