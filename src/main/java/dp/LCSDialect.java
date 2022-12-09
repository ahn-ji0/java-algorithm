package dp;

//코드업 2699 : 사투리 https://codeup.kr/problem.php?id=2699
//Dynamic Programming - LCS 일치하는 값 배열에 저장

import java.util.Scanner;

public class LCSDialect {
    public static int solution(String str1, String str2){
        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                if(str2.charAt(i-1)==str1.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = (dp[i-1][j] > dp[i][j-1]) ? dp[i-1][j] : dp[i][j-1];
            }
        }
        return dp[str2.length()][str1.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1,str2));

    }
}
