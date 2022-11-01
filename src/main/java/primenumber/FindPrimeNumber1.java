package primenumber;

//프로그래머스 소수찾기(level1) https://school.programmers.co.kr/learn/courses/30/lessons/12921
// 1. 2이상 소수 이하의 모든 수로 나누어 보는 방법
public class FindPrimeNumber1 {
    public int prime(int num){
        if(num == 1)
            return 0;
        if(num == 2)
            return 1;

        for(int i=2; i<num; i++){
            if(num % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public int solution(int n) {
        int answer = 0;
        for(int num = 1; num < n+1 ; num++){
            answer += prime(num);
        }
        return answer;
    }

    public static void main(String[] args) {
        FindPrimeNumber1 findPrimeNumber1 = new FindPrimeNumber1();
        System.out.println(findPrimeNumber1.solution(10));
    }
}
