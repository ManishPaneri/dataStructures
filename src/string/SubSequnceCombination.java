package string;

import java.util.HashMap;

public class SubSequnceCombination {


    public static void main (String[] args)
    {
        String m = "GeeksforGeeks";
        String n = "Gks";
        System.out.println(isSubSequenceCount(m, n, m.length(), n.length()));

    }

    public static  int isSubSequenceCount(String str1, String str2, int m , int n ){

        // Base Cases
        if ((m == 0 && n==0)||n ==0)
            return 1;
        if (m == 0)
            return 0;

        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1)){
            return isSubSequenceCount(str1, str2, m-1, n-1) + isSubSequenceCount(str1, str2, m-1, n);

        }

        // If last characters are not matching
        return isSubSequenceCount(str1, str2, m, n-1);


    }
}
