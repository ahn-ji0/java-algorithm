package recursion;

import java.util.Scanner;
//without recursion
public class Fibonacci2 {
    public static int fibonacci(int n){
        int curr = 0;
        int n2 = 0;
        int n1 = 1;
        if(n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            curr = n1 + n2;
            n2 = n1;
            n1 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
