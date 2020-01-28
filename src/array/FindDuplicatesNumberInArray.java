package array;


/*
* Condition array size to less and positive number in the array present
* Condition array in number are only two-time present
* O(n) time, O(1) Space
* */
public class FindDuplicatesNumberInArray {
    private static void printRepeating(int[] arr){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[Math.abs(arr[i])] >= 0){
                arr[Math.abs(arr[i])]= - arr[Math.abs(arr[i])];
            }else{
                System.out.print(Math.abs(arr[i]) +" ");
            }
        }
    }

    // Driver program
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        printRepeating(arr);
    }
}
