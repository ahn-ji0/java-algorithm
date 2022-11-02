package primenumber;

import java.util.ArrayList;
import java.util.List;

public class EratosPrimePractice {
    public int solution(int n) {
        List<Integer> isPrime = new ArrayList<>();
        for(int i=2 ;i <= n ;i++) isPrime.add(i);
        for(int i = 2; i * i <= n ; i++) {
            int finalI = i;
            isPrime.removeIf(num -> num % finalI == 0 && num > finalI);
        }
        return isPrime.size();
    }
    public static void main(String[] args) {
        EratosPrimeNumber ep = new EratosPrimeNumber();
        System.out.println(ep.solution(10));
    }
}
