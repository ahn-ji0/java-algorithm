package search;

import java.util.Scanner;

public class BinarySearch {
    public int solution(int[] nums, int targetNum){
        int firstIdx = 0;
        int lastIdx = nums.length - 1;
        int midIdx = (int) lastIdx / 2;

        while(true){
            if(targetNum == nums[midIdx]){
                break;
            }
            else if(targetNum < nums[midIdx]){
                lastIdx = midIdx - 1;
            }
            else{
                firstIdx = midIdx + 1;
            }
            midIdx = (int) (firstIdx + lastIdx) / 2 ;
        }
        return midIdx;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int targetNum = 7;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.solution(nums,targetNum));

    }
}
