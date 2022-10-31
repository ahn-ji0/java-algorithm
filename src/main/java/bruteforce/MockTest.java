package bruteforce;

import java.util.Arrays;

//배열로 풀정
//https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class MockTest {
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
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2,1,2,3,2,4,2,5};
        int[] student3 = new int[]{3,3,1,1,2,2,4,4,5,5};

        int[] count = new int[]{0,0,0};
        for(int i = 0 ; i< answers.length; i++){
            if(answers[i] == student1[i % student1.length])
                count[0]++;
            if(answers[i] == student2[i % student2.length])
                count[1]++;
            if(answers[i] == student3[i % student3.length])
                count[2]++;
        }
        return maxIndex(count);

    }

    public static void main(String[] args) {
        MockTest mockTest = new MockTest();
        int[] result = mockTest.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(result));
    }
}
