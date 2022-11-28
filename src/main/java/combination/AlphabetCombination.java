package combination;

import java.util.Stack;

public class AlphabetCombination {

    static StringBuffer stack = new StringBuffer();

    public static void print(int n){
        if(stack.length()==n){
            System.out.println(stack);
            return;
        }
        for (char i = 'A'; i <= 'Z' ; i++) {
            stack.append(i);
            print(n);
            stack.deleteCharAt(stack.length()-1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
}
