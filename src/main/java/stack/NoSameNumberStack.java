package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//코드업 같은 숫자는 싫어 https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class NoSameNumberStack {
    public int[] solution(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != stack.peek()){
                stack.push(arr[i]);
            }
        }
        int[] result = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        NoSameNumberStack noSameNumber = new NoSameNumberStack();
        System.out.println(Arrays.toString(noSameNumber.solution(arr)));
    }
}
