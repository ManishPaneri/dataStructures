package string;

import java.util.*;

public class HammingDistanceStringsArray {

    private static int[] anagramTwoStringsArrays(List<String> a, List<String> b) {
        int maxsize = Math.max(a.size(), b.size());
        int[] distance = new int[maxsize];
        int minSize = Math.min(a.size(), b.size());
        int i = 0;
        for (; i < minSize; i++) {
            distance[i] = hammingDistance(a.get(i).toCharArray(), b.get(i).toCharArray());
        }

        while (i < maxsize) {
            if (i > a.size()) {
                distance[i] = a.get(i).toCharArray().length;
            } else {
                distance[i] = b.get(i).toCharArray().length;
            }
            i++;
        }

        return distance;
    }

    private static int hammingDistance(char[] strArr, char[] strBrr) {
        int i = 0;
        HashMap<Character, Integer> str = new HashMap<>();
        for(char c: strArr){
            if(str.containsKey(c)){
                str.put(c, str.get(c)+1);
            }else{
                str.put(c, 1);
            }
        }
        int strMinSize = Math.min(strArr.length, strBrr.length);
        int strMaxSize = Math.max(strArr.length, strBrr.length);
        int count = strMaxSize - strMinSize;
        while (i < strMinSize) {
            if (str.containsKey(strBrr[i])){
               int val = str.get(strBrr[i])-1;
               if(val<=0){
                   str.remove(strBrr[i]);
               }else{
                   str.put(strBrr[i], val);
               }
            }else{
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String args[]) {
        List<String> aList = new ArrayList<>();
        aList.add("abb");
        aList.add("bab");
        aList.add("manish");
        List<String> bList = new ArrayList<>();
        bList.add("bb");
        bList.add("ab");
        bList.add("iamnsh");
        bList.add("panery");
        int[] dis = anagramTwoStringsArrays(aList, bList);
        for (int di : dis) {
            System.out.print(di + " ");
        }
    }

}
