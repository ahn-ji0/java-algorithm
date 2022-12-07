package heap;

import java.util.PriorityQueue;

public class Hotter {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(var value: scoville){
            priorityQueue.add(value);
        }
        while(priorityQueue.peek() < K) {
            Integer first = priorityQueue.poll();
            Integer second = priorityQueue.poll();
            if(first == null || second == null){
                return -1;
            }
            int tmp = first + second * 2;
            priorityQueue.add(tmp);
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        Hotter hotter = new Hotter();
        System.out.println(hotter.solution(scoville,K));
    }
}
