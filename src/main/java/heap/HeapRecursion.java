package heap;

import java.util.Arrays;

public class HeapRecursion {
    public static int[] solution(int[] arr,int i){
        int leftIdx = 2 * i + 1;
        int rightIdx = 2 * i + 2;
        int greatIdx = i;
        if(leftIdx < arr.length && arr[leftIdx] > arr[greatIdx]){
            greatIdx = leftIdx;
        }
        if (rightIdx < arr.length && arr[rightIdx] > arr[greatIdx]){
                greatIdx = rightIdx;
        }
        if(i!=greatIdx) {
            int tmp = arr[greatIdx];
            arr[greatIdx] = arr[i];
            arr[i] = tmp;
            solution(arr,i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,5,7,8};
        for (int i = (arr.length -2)/2; i >=0 ; i--) {
            arr = solution(arr,i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
