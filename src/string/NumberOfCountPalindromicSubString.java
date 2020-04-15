package string;


/*
    Input : str = "aabbb"
    Output : 4
    All Special substring are: "aa", "bb", "bbb", "bb"

*/
public class NumberOfCountPalindromicSubString {

     public static int countPalindromeSubString(String str){
         int n = str.length();
         int totalCount =0;
         int[] sameCharArr = new int[n];
         for(int index=0; index < n; index++){
             sameCharArr[index]=0;
         }

         int i=0;
         while(i < n){
             int sameCharCount= 1;
             int j=i+1;
             while( j < n && str.charAt(i)==str.charAt(j)){
                 sameCharCount++;
                 j++;
             }
             // Case : 1
             // so total number of
             // substring that we can
             // generate are : K *( K + 1 ) / 2
             // here K is sameCharCount
             totalCount = totalCount +( sameCharCount * (sameCharCount + 1)/2);
             sameCharArr[i]= sameCharCount;
             i=j;

         }

         // Case 2: Count all odd length
         //           Special Palindromic
         //           substring
         for (int j = 1; j < n; j++)
         {
             // if current character is
             // equal to previous one
             // then we assign Previous
             // same character count to
             // current one
             if (str.charAt(j) == str.charAt(j - 1))
                 sameCharArr[j] = sameCharArr[j - 1];

             // case 2: odd length
             if (j < (n - 1) && (str.charAt(j - 1) == str.charAt(j + 1) && str.charAt(j) != str.charAt(j - 1)))
                 totalCount += Math.min(sameCharArr[j - 1],sameCharArr[j + 1]);
         }
         return totalCount - n ;
     }

    public static void main(String args[])
    {
        String str = "aabbb";
        System.out.print(countPalindromeSubString(str));
    }
}
