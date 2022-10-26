package kthNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KthNumberTest {
    @Test

    public void KthNumber() {
        KthNumber kthNumber = new KthNumber();
        int[] array = new int[] {1,5,2,6,3,7,4};
        int[][] commands = new int[][] {{2,5,3},{4,4,1},{1,7,3}};
        assertArrayEquals(new int[]{5, 6, 3}, kthNumber.solution(array,commands));
    }

    @Test

    public void KthNumberPriorityQueue() {
        KthNumberPriorityQueue kthNumberPriorityQueue = new KthNumberPriorityQueue();
        int[] array = new int[] {1,5,2,6,3,7,4};
        int[][] commands = new int[][] {{2,5,3},{4,4,1},{1,7,3}};
        assertArrayEquals(new int[]{5, 6, 3}, kthNumberPriorityQueue.solution(array,commands));
    }
}