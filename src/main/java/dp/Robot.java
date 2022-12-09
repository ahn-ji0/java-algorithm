package dp;

import java.util.ArrayDeque;
import java.util.Queue;

public class Robot {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static boolean isSafe(int x, int y){
        x = Math.abs(x);
        y = Math.abs(y);
        int sum = 0;
        while(x!=0){
            sum += x%10;
            x /= 10;
        }
        while(y!=0){
            sum += y%10;
            y /= 10;
        }
        return sum <= 23;
    }
    public static void main(String[] args) {
        int[][] visited = new int[20][20];
        Queue<int[]> queue = new ArrayDeque<>();
        int x = 10;
        int y = 10;
        visited[x][y] = 1;
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] location = queue.poll();
            x = location[0];
            y = location[1];
            for (int i = 0; i < dx.length; i++) {
                int tmpX = x + dx[i];
                int tmpY = y + dy[i];

                if(tmpX < 0 || tmpX >= visited.length || tmpY < 0 || tmpY >= visited.length) continue;
                if(visited[tmpX][tmpY]==1 || !isSafe(tmpX,tmpY)) continue;

                visited[tmpX][tmpY] = 1;
                queue.add(new int[] {tmpX,tmpY});
            }
        }
    }
}
