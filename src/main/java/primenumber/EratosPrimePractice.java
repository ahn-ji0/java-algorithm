package primenumber;

import java.util.ArrayList;
import java.util.List;

public class EratosPrimePractice {
    public int solution(int n) {
        List<Integer> isPrime = new ArrayList<>();
        for(int i=2 ;i <= n ;i++) isPrime.add(i);
        isPrime.removeIf(num -> num % 2 == 0 && num > 2);
        return 0;
    }
    public static void main(String[] args) {
        EratosPrimeNumber ep = new EratosPrimeNumber();
        System.out.println(ep.solution(10));
    }
}
