package sort;

import java.util.Arrays;

public class BubbleSort2 {

    public int[] sort(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4,3,7,9,13,11};
        BubbleSort2 bubbleSort2 = new BubbleSort2();
        arr = bubbleSort2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
