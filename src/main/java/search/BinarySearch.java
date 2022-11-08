package search;

import java.util.Scanner;

public class BinarySearch {
    public int solution(int[] nums, int targetNum){
        int firstIdx = 0;
        int lastIdx = nums.length - 1;
        int midIdx;

        int targetIdx = -1;

        while(firstIdx <= lastIdx){
            midIdx = (firstIdx + lastIdx) / 2 ;
            if(targetNum == nums[midIdx]){
                targetIdx = midIdx;
                break;
            }
            else if(targetNum < nums[midIdx]){
                lastIdx = midIdx - 1;
            }
            else{
                firstIdx = midIdx + 1;
            }
        }
        return targetIdx;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int targetNum = 15;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.solution(nums,targetNum));

    }
}
