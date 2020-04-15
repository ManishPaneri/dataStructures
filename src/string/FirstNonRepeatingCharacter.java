package string;

import java.util.HashMap;

/*
Input  : a b c a b d c
Output : a a a b c c d
*/

public class FirstNonRepeatingCharacter {

    static void getNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            // If character already occurred,
            if (hm.containsKey(str.charAt(i))) {
                // updating count
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);

                for (int j = index; j <= i; j++) {

                    if ((hm.containsKey(str.charAt(j)) && hm.get(str.charAt(j)) == 1)
                            ||!hm.containsKey(str.charAt(j))) {
                        index = j;
                        break;
                    }
                }
            }

            // If it's first occurrence, then store the index and count = 1
            else {
                hm.put(str.charAt(i), 1);
            }

            System.out.print(str.charAt(index)+" ");
        }
    }

    // Driver method
    public static void main(String[] args) {
        String str = "abcabdc";
        getNonRepeatingCharacter(str);

    }
}
