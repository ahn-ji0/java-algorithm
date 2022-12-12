package dp;

import java.util.Arrays;

public class MinPath {

    public static int solution(int[][] map){
        int[][] dp = new int[map.length][map[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if(i==0 && j==0) dp[i][j] = map[i][j];
                else if(i==0 && j > 0) dp[i][j] =  map[i][j] + map[i][j-1];
                else if(i > 0 && j==0) dp[i][j] = map[i][j] + map[i-1][j];
                else
                    dp[i][j] = map[i][j] + Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
            }
        }

        return dp[dp.length-1][dp.length-1];
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,3,2},{4,6,2},{1,2,4}}));

    }
}
