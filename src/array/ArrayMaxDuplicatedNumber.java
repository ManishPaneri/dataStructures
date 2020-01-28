package array;

public class ArrayMaxDuplicatedNumber {

  static int minX(int[] arr, int n) {

    int pre[] = new int[n];

    // Initialize the prefix value for first index
    // as the first element of the array
    pre[0] = arr[0];

    // Compute the prefix sum for rest of the indices
    for (int i = 1; i < n; i++) pre[i] = pre[i - 1] + arr[i];

    int k = Integer.MAX_VALUE;

    for (int i = 0; i < n - 1; i++) {

      // Sum of elements from arr[i + 1] to arr[n - 1]
      int rightSum = pre[n - 1] - pre[i];

      // If sum on the right side of the ith element
      // is greater than or equal to the sum on the
      // left side then update the value of k
      if (rightSum >= pre[i]) k = Math.min(k, rightSum - pre[i]);
    }

    if (k != Integer.MAX_VALUE) return k;
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {-5,4,-2,3,1,-1,-6,-1,0,5};
//    int[] arr = {-2, 3, 1, -5};
    System.out.println(minX(arr, 4));
  }
}
