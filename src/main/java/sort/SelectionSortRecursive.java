package sort;

import java.util.Arrays;

public class SelectionSortRecursive {
    public int[] sort(int[] arr,int num){

        //base case
        if(num == 1){
            return arr;
        }

        //recursive
        sort(arr,num-1);

        int tmp = arr[num];
        int j;
        for(j=num-1; j >= 0; j--) {
            if (tmp < arr[j]) {
                arr[j+1] = arr[j];
            } else break;
        }
        arr[j+1] = tmp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,4,3};
        SelectionSortRecursive selectionSort = new SelectionSortRecursive();
        arr = selectionSort.sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
