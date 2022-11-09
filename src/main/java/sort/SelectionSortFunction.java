package sort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class SelectionSortFunction {

    public int[] solution(int[] arr, BiPredicate<Integer,Integer> compare){
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int valIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(compare.test(arr[j],val)){
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
        // Function 사용
        Function<Integer[], Boolean> ascendSort1 = (arr) -> arr[0] < arr[1];
        Function<Integer[], Boolean> descendSort1 = (arr) -> arr[0] > arr[1];

        // BiPredicate 사용
        BiPredicate<Integer,Integer> ascendSort2 = (a,b) -> a < b;
        BiPredicate<Integer,Integer> descendSort2 = (a,b) -> a > b;

        BiFunction<Integer,Integer,Boolean> ascendSort = (a, b) -> a < b;
        BiFunction<Integer,Integer,Boolean> descendSort = (a, b) -> a > b;
        int[] test = new int[] {7,4,2,10,9,223,111,23,3,39};

        SelectionSortFunction sort = new SelectionSortFunction();
        int[] arr = sort.solution(test,ascendSort2);
        System.out.println(Arrays.toString(arr));

        arr = sort.solution(test,descendSort2);
        System.out.println(Arrays.toString(arr));
    }
}
