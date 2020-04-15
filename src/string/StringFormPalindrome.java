package string;

import java.util.ArrayList;
import java.util.List;

public class StringFormPalindrome {

    private static boolean canFormPalindrome(String str){
        List<Character> list = new ArrayList<Character>();
        for(int i =0; i< str.length(); i++){
            if(list.contains(str.charAt(i))){
                list.remove((Character)str.charAt(i));
            }else{
                list.add(str.charAt(i));
            }
        }

        if((str.length()%2==0 && list.size()==0) ||(str.length()%2==1 && list.size()==1)){
            return true;
        }
        return false;
    }

    public  static void main(String args[]){
        String str = "rotator";
        if(canFormPalindrome(str)){
            System.out.println("Palindrome Possible");
        }else {
            System.out.println("Palindrome Not Possible");
        }
    }
}
