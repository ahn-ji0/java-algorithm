package sort;

import java.util.Arrays;

public class SelectionSortDescending {
    public int[] solution(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    maxIdx = j;
                }
            }
            arr[maxIdx] = arr[i];
            arr[i] = max;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSortDescending sort = new SelectionSortDescending();
        int[] arr = sort.solution(new int[] {7,4,2,10,9,223,111,23,3,39});
        System.out.println(Arrays.toString(arr));
    }
}
