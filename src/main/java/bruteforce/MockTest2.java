package bruteforce;

import java.util.Arrays;

//문자열로 풀기 - 공간복잡도는 up, 하지만 속도도 빨라진다.
//https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class MockTest2 {
    public int[] maxIndex(int[] count){
        int maxVal = 0;
        int num = 0;
        int[] temp = new int[3];
        for(int i = 0; i< count.length;i++){
            if(count[i]> maxVal){
                maxVal = count[i];
                num = 1;
                temp[num-1] = i+1;
            }
            else if(count[i] == maxVal){
                num ++ ;
                temp[num-1] = i+1;
            }
        }
        int[] answer = Arrays.copyOfRange(temp,0, num);
        return answer;
    }
    public int[] solution(int[] answers) {
        String student1 = "12345".repeat(4000);
        String student2 = "21232425".repeat(1250);
        String student3 = "3311224455".repeat(1000);

        int[] count = {0,0,0};
        for(int i = 0 ; i < answers.length ; i++){
            if(Character.getNumericValue(student1.charAt(i))==answers[i]){
                count[0]++;
            }
            if(Character.getNumericValue(student2.charAt(i))==answers[i]){
                count[1]++;
            }
            if(Character.getNumericValue(student3.charAt(i))==answers[i]){
                count[2]++;
            }
        }
        return maxIndex(count);

    }

    public static void main(String[] args) {
        MockTest2 mockTest = new MockTest2();
        int[] result = mockTest.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(result));
    }
}
