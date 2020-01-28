package Number;


/*
Input: 4189, 9
Output: 3
    There are three substrings which recursively add to k.
    The substrings are 18, 9 and 189.
*/
public class NumberSubsequencesRecursivelyAddKCount {

    static int countks(String number, int k){
        // To store result
        int count = 0;
        int n = number.length();

        for(int i=0; i < n ;i++){
            int sum = number.charAt(i)-'0';
            if(sum == k){
                count++;
            }

            for(int j=i+1; j < n; j++){
                sum = (sum + number.charAt(j)-'0')%k;
                if(sum == 0){
                    count++;
                }
            }
        }
        return count;
    }

    // Driver Code
    public static void main (String[] args)
    {
        System.out.println(countks("4189", 9));
        System.out.println(countks("1809",5));
    }

}
