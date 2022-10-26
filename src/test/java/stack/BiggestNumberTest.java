package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiggestNumberTest {
    @Test

    public void BiggestNumber() {
        BiggestNumber biggestNumber = new BiggestNumber();

        assertEquals("6210",biggestNumber.solution(new int[]{6,10,2}));
    }
}