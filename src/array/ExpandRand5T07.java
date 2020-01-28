package array;

import java.util.Random;

public class ExpandRand5T07 {

    public static void main (String[] args)
    {
        System.out.println(rand7());
    }

    private static int rand7(){
        int i;
        do
        {// n*rand7-1+rand7
          i = 5 * (new Random().nextInt(6) - 1) + new Random().nextInt(6);
        } while(i > 7);
        return Math.abs(i % 7 + 1);
    }
}
