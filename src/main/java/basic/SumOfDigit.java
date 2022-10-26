package basic;

import java.util.List;

/* 프로그래머스 코딩테스트 연습 > 연습문제 > 자릿수 더하기 */
public class SumOfDigit {
    public static int solutionB(int n) {
        // %연산 이용 몫, 나머지
        int answer = 0;
        while(n!=0){
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
    public static int solutionA(int n){
        //시간 초과
        int answer = 0;
        List<String> myList = List.of(String.valueOf(n).split(""));

        for(String val: myList){
            answer += Integer.parseInt(val);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solutionA(1234));
        System.out.println(solutionB(1234));

    }
}
