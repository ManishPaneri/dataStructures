package string;

public class CheckSubSequnceCombination {

    public static void main (String[] args)
    {
        String m = "geeksforgeeks";
        String n = "gksrek";
        if(isSubSequence(m, n, m.length(), n.length())){
            System.out.println("Sub Sequence Present");
        }else{
            System.out.println("Sub Sequence Combination Not Present");
        }

    }

    public static  boolean isSubSequence(String str1, String str2, int m , int n ){

        // Base Cases
        if (n == 0)
            return true;
        if (m == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1)){
            return isSubSequence(str1, str2, m-1, n-1);
        }

        // If last characters are not matching
        return isSubSequence(str1, str2, m-1 , n);
    }
}


