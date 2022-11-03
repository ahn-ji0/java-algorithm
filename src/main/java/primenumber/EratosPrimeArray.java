package primenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosPrimeArray {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        int count = 0;
        Arrays.fill(isPrime,true);
        for(int i=2; i * i <= n; i++){
            if(isPrime[i]==true){
                for(int j=2; j<= n/i ; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        for(int i=2; i <= n; i++){
            if(isPrime[i]==true) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        EratosPrimeNumber ep = new EratosPrimeNumber();
        System.out.println(ep.solution(10));
    }
}
