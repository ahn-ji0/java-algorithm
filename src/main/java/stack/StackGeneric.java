package stack;

public class StackGeneric<T> {
    //제네릭 배열은 생성이 안됨 => 왜?
    private T[] arr = (T[]) new Object[10000];
    private int pointer = 0;

    public StackGeneric() {
    }

    public StackGeneric(int size) {
        this.arr = (T[]) new Object[size];
    }

    public void push(T value){
        arr[this.pointer] = value;
        this.pointer++;
    }

    public T pop(){
        return arr[--this.pointer];
    }

    //returns the top value of stack
    public T peek(){
        return arr[this.pointer - 1];
    }

    //returns true if stack is empty
    public boolean isEmpty(){
        return this.pointer == 0;
    }

    public T[] getArr(){
        return arr;
    }
}
