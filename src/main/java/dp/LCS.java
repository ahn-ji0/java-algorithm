package dp;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; //열
        String str2 = "DCABDC"; //행

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                System.out.printf("str2: %s str1: %s\n",str2.charAt(i),str1.charAt(j));
                if(str2.charAt(j)==str1.charAt(i)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }


    }
}
