package binary;

import java.util.Arrays;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(String value : answer){
            value = "0".repeat(n);
        }

        for (int i = 0; i < n; i++) {
            answer[i]=Integer.toBinaryString(arr1[i]|arr2[i]).replace("1","#").replace("0"," ");
            answer[i] = "0".repeat(n-answer[i].length())+answer[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        String[] answer = secretMap.solution(5, new int[]{9,20,28,18,11},new int[]{30,1,21,17,28});
        System.out.println(Arrays.toString(answer));
    }
}
