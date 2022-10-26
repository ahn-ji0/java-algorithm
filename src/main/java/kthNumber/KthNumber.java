package kthNumber;

import java.util.Arrays;

//run time error
public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for(int[] command:commands) {
            int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(temp);
            answer[count++] = temp[command[2]-1];
        }
        return answer;
    }
}
