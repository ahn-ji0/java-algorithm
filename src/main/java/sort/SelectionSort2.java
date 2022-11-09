package sort;

import java.util.Arrays;

public class SelectionSort2 {
    public int[] solution(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort2 sort = new SelectionSort2();
        int[] arr = sort.solution(new int[] {2,7,4,9,10,223,111,23,3,39});
        System.out.println(Arrays.toString(arr));
    }
}
