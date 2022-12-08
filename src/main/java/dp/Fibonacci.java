package dp;

public class Fibonacci {
    public static int solution(int n){
        int[] fib = new int[n];

        for (int i = 0; i < n; i++) {
            if(i==0 || i==1) fib[i] = 1;
            else fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n-1];
    }
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
