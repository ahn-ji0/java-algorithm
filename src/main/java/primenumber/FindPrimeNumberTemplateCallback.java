package primenumber;

import primenumber.range.HalfNRange;
import primenumber.range.NRange;
import primenumber.range.Range;
import primenumber.range.RootNRange;

//프로그래머스 소수찾기(level1) https://school.programmers.co.kr/learn/courses/30/lessons/12921
// template callback 적용하여 1.n미만 2.n/2이하 3.루트 n이하 세가지 방법 적용
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

        for(int i=2; range.compare(i,num); i++){
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
        Range range = new NRange();
        FindPrimeNumberTemplateCallback findPrimeNumber1 = new FindPrimeNumberTemplateCallback(range);
        System.out.println(findPrimeNumber1.solution(10));
        range = new HalfNRange();
        FindPrimeNumberTemplateCallback findPrimeNumber2 = new FindPrimeNumberTemplateCallback(range);
        System.out.println(findPrimeNumber2.solution(10));
        range = new RootNRange();
        FindPrimeNumberTemplateCallback findPrimeNumber3 = new FindPrimeNumberTemplateCallback(range);
        System.out.println(findPrimeNumber3.solution(10));
    }
}
