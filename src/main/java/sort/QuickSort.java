package sort;

import java.util.Arrays;

public class QuickSort {
    public int[] solution(int[] arr, int start, int end){
        int pivot = arr[(start+end) /2];
        int leftIdx = start;
        int rightIdx = end;
        while(leftIdx <= rightIdx) {
            while (pivot > arr[leftIdx]) leftIdx++;
            while (pivot < arr[rightIdx]) rightIdx--;

            if(leftIdx<=rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx++;
                rightIdx--;
            }
        }
        if(start < rightIdx) solution(arr,start,rightIdx);
        if(leftIdx < end) solution(arr,leftIdx,end);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20,18,5,19,40,50,5,25};
        QuickSort quickSort = new QuickSort();
        int[] sorted = quickSort.solution(arr,0,arr.length-1);
        System.out.println(Arrays.toString(sorted));
    }
}
