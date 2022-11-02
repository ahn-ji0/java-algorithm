package primenumber;

public class EratosPrimeNumber {
    public int solution(int n) {
        int answer = 0;
        Boolean[] isPrime = new Boolean[n+1];

        for(int i=2; i <= n; i++){
            if(isPrime[i]==null){
                isPrime[i]=true;
                answer ++;
                for(int j = 2; j <= (int)n / i ; j++){
                    isPrime[j*i]=false;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        EratosPrimeNumber ep = new EratosPrimeNumber();
        System.out.println(ep.solution(10));
    }
}
