package dp;

public class OptimalStrategy {
    class Pair{
        private int left;
        private int right;

        public Pair( int left, int right){
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "("+this.left+","+this.right+")";
        }

        public int sum(){
            return this.left + this.right;
        }

    }
    public void solution(int[] arr){
        Pair[][] dp = new Pair[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = new Pair(arr[i],0);
        }

        for (int i = 1; i < arr.length; i++) {
            dp[i-1][i] = new Pair(Math.max(arr[i-1],arr[i]),Math.min(arr[i-1],arr[i]));
        }
        for (int k = 2; k < arr.length; k++) {
            for (int i = 0; k + i < arr.length; i++) {
                int j = i + k;
                int sum = dp[i][j - 1].sum() + arr[j];
                int left = Math.max(dp[i][j - 1].right + arr[j], dp[i + 1][j].right + arr[i]);
                int right = sum - left;
                dp[i][j] = new Pair(left,right);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,7,40,19};

        OptimalStrategy optimalStrategy = new OptimalStrategy();
        optimalStrategy.solution(arr);
    }
}
