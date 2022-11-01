package primenumber;

import primenumber.range.HalfNRange;
import primenumber.range.NRange;
import primenumber.range.Range;
import primenumber.range.RootNRange;

//프로그래머스 소수찾기(level1) https://school.programmers.co.kr/learn/courses/30/lessons/12921
// template callback 적용하여 1.n미만 2.n/2이하 3.루트 n이하 세가지 방법 적용
public class FindPrimeNumberTemplateCallback {

    public int prime(int num, Range range){
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
    public int solution(int n, Range range) {
        int answer = 0;
        for(int num = 1; num < n+1 ; num++){
            answer += prime(num,range);
        }
        return answer;
    }

    public static void main(String[] args) {
        FindPrimeNumberTemplateCallback findPrimeNumber1 = new FindPrimeNumberTemplateCallback();
        System.out.println(findPrimeNumber1.solution(10,new NRange()));
        System.out.println(findPrimeNumber1.solution(10,new HalfNRange()));
        System.out.println(findPrimeNumber1.solution(10,new RootNRange()));

    }
}
