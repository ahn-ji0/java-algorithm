package sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr){
        for (int i=arr.length-1;i>0;i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4,3,7,9,13,11};
        BubbleSort bubbleSort = new BubbleSort();
        arr = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
