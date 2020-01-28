package Number;



/*
the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
*/

public class NumberStartAndEndWith1Count {

    static int countSubStr(String number ) {
        int n = number.length();
        int m = 0;
        for(int i =0; i<n; i++){
            if(number.charAt(i)=='1'){
                m++;
            }
        }
        return m * (m-1)/2;
    }

    // Driver program to test the above function
    public static void main(String[] args)
    {
        String string = "10100101";
        System.out.println(countSubStr(string));
    }
}
