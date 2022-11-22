package recursion;

import java.util.ArrayList;
import java.util.List;

public class AddElementsInList {
    public static int listSum(List<Integer> nums){
        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size()-1) + listSum(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        System.out.println(listSum(nums));
    }
}
