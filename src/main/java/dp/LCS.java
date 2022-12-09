package dp;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; //열
        String str2 = "DCABDC"; //행

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                System.out.printf("str2: %s str1: %s\n",str2.charAt(i-1),str1.charAt(j-1));
                if(str1.charAt(j-1)==str2.charAt(i-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else{
                    dp[i][j] = (dp[i-1][j] > dp[i][j-1]) ? dp[i-1][j] : dp[i][j-1];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        int answer = dp[str2.length()][str1.length()];
        System.out.println(answer);

    }
}
