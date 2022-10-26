package stack;

import java.util.Stack;

public class BiggestNumber {
    Stack<Integer> arr = new Stack<>();
    int max = 0;

    public void dfs(int[] numbers) {
        if (arr.size() == numbers.length) {
            String num = arr.toString().replaceAll("[^0-9]","");
            int numInt = Integer.parseInt(num);
            if (numInt > max) {
                max = numInt;
            }
            return;
        }

        for(int number : numbers){
            if(!arr.contains(number)){
                arr.push(number);
                dfs(numbers);
                arr.pop();
            }
        }
    }
    public String solution(int[] numbers) {

        dfs(numbers);

        return Integer.toString(max);
    }
}
