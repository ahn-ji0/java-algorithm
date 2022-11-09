package sort;

import java.util.Arrays;

public class SelectionSortTemplate {
    private Compare compare;

    public SelectionSortTemplate(Compare compare) {
        this.compare = compare;
    }

    public int[] solution(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int valIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(compare.compare(arr[j],val)){
                    val = arr[j];
                    valIdx = j;
                }
            }
            arr[valIdx] = arr[i];
            arr[i] = val;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSortTemplate ascendSort = new SelectionSortTemplate((a,b)-> a < b);
        SelectionSortTemplate descendSort = new SelectionSortTemplate((a,b)-> a > b);
        int[] test = new int[] {7,4,2,10,9,223,111,23,3,39};

        int[] arr = ascendSort.solution(test);
        System.out.println(Arrays.toString(arr));

        arr = descendSort.solution(test);
        System.out.println(Arrays.toString(arr));
    }
}
