package primenumber;

public class EratosPrimeNumber {
    public int solution(int n) {
        int answer = 0;
        boolean[] isComposit = new boolean[n+1];

        for(int i=2; i * i <= n; i++){
            if(isComposit[i]==false){
                for(int j = 2; j <= (int)n / i ; j++){
                    isComposit[j*i]=true;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(isComposit[i]==false)
                answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        EratosPrimeNumber ep = new EratosPrimeNumber();
        System.out.println(ep.solution(10));
    }
}
