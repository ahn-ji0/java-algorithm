package sort;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[] arr){
        int i = 0;
        int j = 0;

        for(i=1;i<arr.length;i++){
            int tmp = arr[i];
            for(j=i-1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j+1] = arr[j];
                } else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,4,3};
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
