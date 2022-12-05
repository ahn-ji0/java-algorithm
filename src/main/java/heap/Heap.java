package heap;

import java.util.Arrays;

public class Heap {
    public static int[] solution(int[] arr){
        int depth = (arr.length-1 -1) / 2;
        for (int i = depth; i >= 0; i--) {
            int leftIdx = 2 * i + 1;
            int rightIdx = 2 * i + 2;
            int greatIdx = i;
            if(leftIdx < arr.length && arr[leftIdx] > arr[greatIdx]){
                greatIdx = leftIdx;
            }
            if (rightIdx < arr.length && arr[rightIdx] > arr[greatIdx]){
                    greatIdx = rightIdx;
            }
            int tmp = arr[greatIdx];
            arr[greatIdx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {6,5,7,8})));
    }
}
