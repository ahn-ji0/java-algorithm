package stack;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value){
        arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop(){
        return arr[--this.pointer];
    }

    //returns the top value of stack
    public int peek(){
        return arr[this.pointer - 1];
    }

    //returns true if stack is empty
    public boolean isEmpty(){
        return this.pointer == 0;
    }

    public int[] getArr(){
        return arr;
    }
}
