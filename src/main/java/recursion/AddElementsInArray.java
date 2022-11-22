package recursion;

import java.util.ArrayList;
import java.util.List;

public class AddElementsInArray {
    public static int listSum(int[] nums, int idx){
        if(idx >= nums.length) return 0;
        return nums[idx] + listSum(nums,idx+1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,3,2,9};
        System.out.println(listSum(nums,0));
    }
}
