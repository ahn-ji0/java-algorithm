package sort;

import java.util.Arrays;

public class QuickSort {
    public int[] solution(int[] arr, int start, int end){
        int pivot;
        pivot = arr[arr.length /2];
        int leftIdx = start;
        int rightIdx = end;
        while(leftIdx <= rightIdx) {
            while (pivot > arr[leftIdx]) leftIdx++;
            while (pivot < arr[rightIdx]) rightIdx--;

            int temp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = temp;
            leftIdx++;
            rightIdx--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20,18,5,19,40,50,5,25};
        QuickSort quickSort = new QuickSort();
        int[] sorted = quickSort.solution(arr,0,arr.length-1);
        System.out.println(Arrays.toString(sorted));
    }
}
