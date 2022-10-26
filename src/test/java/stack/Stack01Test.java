package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Stack01Test {

    @Test
    void pushTest(){
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);
        stack01.push(30);

        int[] arr = stack01.getArr();

        Assertions.assertEquals(10,arr[0]);
        Assertions.assertEquals(20,arr[1]);
        Assertions.assertEquals(30,arr[2]);

        Assertions.assertEquals(30,stack01.pop());
        Assertions.assertEquals(20,stack01.peek());
        Assertions.assertEquals(false,stack01.isEmpty());

        stack01.pop();
        stack01.pop();

        Assertions.assertEquals(true,stack01.isEmpty());

    }

}