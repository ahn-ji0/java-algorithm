package bruteforce;

//https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class MockTest {
    public int[] solution(int[] answers) {
        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2,1,2,3,2,4,2,5};
        int[] student3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int i = 0;
        int j = 0;
        int k = 0;
        int[] count = new int[]{0,0,0};
        for(int answer : answers){
            if(answer == student1[i]){
                count[0] ++;
            }
            if(answer == student2[j]){
                count[1] ++;
            }
            if(answer == student3[k]){
                count[2] ++;
            }
            i++; j++; k++;
            if(i >= student1.length) i = 0;
            if(j >= student2.length) j = 0;
            if(k >= student3.length) k = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        MockTest mockTest = new MockTest();
        int[] result = mockTest.solution(new int[]{1,2,3,4,5});
        System.out.println(result);
    }
}
