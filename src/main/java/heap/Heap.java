package heap;

import java.util.Arrays;

public class Heap {
    public static int[] solution(int[] arr){
        int depth = (arr.length-1 -1) / 2;
        for (int i = depth; i >= 0; i--) {
            if(arr[2*i + 1] > arr[i]){
                int tmp = arr[i];
                arr[i] = arr[2*i + 1];
                arr[2*i + 1] = tmp;
            }
            if (arr[2*i + 2] > arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[2*i+2];
                    arr[2*i+2] = tmp;
                }
            }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {6,5,7,8,9})));
    }
}
