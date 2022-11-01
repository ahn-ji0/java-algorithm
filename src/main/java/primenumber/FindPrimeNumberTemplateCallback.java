package primenumber;

import primenumber.range.Range;
import primenumber.range.RootNRange;

//프로그래머스 소수찾기(level1) https://school.programmers.co.kr/learn/courses/30/lessons/12921
// 3. 루트 n 이하의 수들로 나누어 보기
public class FindPrimeNumberTemplateCallback {
    private Range range;

    public FindPrimeNumberTemplateCallback(Range range) {
        this.range = range;
    }

    public int prime(int num){
        if(num == 1)
            return 0;
        if(num == 2 || num ==3)
            return 1;

        for(int i=2; i <= range.getRange(num); i++){
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
        Range range = new RootNRange();
        FindPrimeNumberTemplateCallback findPrimeNumber = new FindPrimeNumberTemplateCallback(range);
        System.out.println(findPrimeNumber.solution(10));
    }
}
