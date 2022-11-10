package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoSameNumber {
    public int[] solution(int[] arr){
        List<Integer> array = new ArrayList<>();
        array.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                array.add(arr[i]);
            }
        }
        int[] result = new int[array.size()];
        for (int j = 0; j < array.size(); j++) {
            result[j] = array.get(j);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        NoSameNumber noSameNumber = new NoSameNumber();
        System.out.println(Arrays.toString(noSameNumber.solution(arr)));
    }
}
