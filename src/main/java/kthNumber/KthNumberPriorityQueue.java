package kthNumber;

import java.util.PriorityQueue;

//run time error
public class KthNumberPriorityQueue {
    int[] array;
    public int getKthNum(int[] command){
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=command[0]-1;i<command[1];i++){
            pq.add(array[i]);
        }
        for(int i=0;i<command[2];i++){
            result = pq.poll();
        }
        return result;
    }
    public int[] solution(int[] array, int[][] commands) {
        this.array = array;
        int[] answer = new int[commands.length];
        for(int i=0;i< commands.length;i++){
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }
}
