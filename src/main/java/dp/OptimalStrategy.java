package dp;

public class OptimalStrategy {
    class Pair{
        private int left;
        private int right;

        public Pair( int left, int right){
            this.left = left;
            this.right = right;
        }

    }
    public Pair solution(int[] arr){
        Pair[][] dp = new Pair[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = new Pair(arr[i],0);
        }

        for (int i = 1; i < arr.length; i++) {
            dp[i-1][i] = new Pair(Math.max(arr[i-1],arr[i]),Math.min(arr[i-1],arr[i]));
        }
        return new Pair(0,0);
    }
    public static void main(String[] args) {
        int[] arr = {2,7,40,19};

        OptimalStrategy optimalStrategy = new OptimalStrategy();
        optimalStrategy.solution(arr);
    }
}
