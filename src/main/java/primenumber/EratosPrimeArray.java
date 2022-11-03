package primenumber;

import java.util.ArrayList;
import java.util.List;

public class EratosPrimeArray {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        int count = 0;
        for(int i=2; i< n+1; i++){
            isPrime[i]=true;
        }
        for(int i=2; i< n+1; i++){
            if(isPrime[i]==true){
                count++;
                for(int j=2; j<= n/i ; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        EratosPrimeNumber ep = new EratosPrimeNumber();
        System.out.println(ep.solution(10));
    }
}
