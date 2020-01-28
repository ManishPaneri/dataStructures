package array;

import java.util.ArrayList;
import java.util.List;

public class CombinationNumber {

    public static void combination(List<List<String>> list, List<String> tempList, List<String> nums, int start) {
        list.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.size(); i++) {
            tempList.add(nums.get(i));
            combination(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }


}
