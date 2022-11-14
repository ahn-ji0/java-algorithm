package primenumber;

import java.util.Arrays;

public class EratosPrimeArray2 {
    public int solution(int[] isPrime) {

        for(int i=0; i < isPrime.length; i++){
            if(isPrime[i] != 0){
                for(int j = isPrime[i]; j < isPrime.length - i; j += isPrime[i]){
                    isPrime[i+j] = 0;
                }
            }
        }
        int count = 0;
        for(int i=0; i< isPrime.length; i++){
            if(isPrime[i]!=0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        EratosPrimeArray2 eratosPrimeArray2 = new EratosPrimeArray2();
        System.out.println(eratosPrimeArray2.solution(new int[]{2,3,4,5,6,7,8,9,10}));
    }
}
