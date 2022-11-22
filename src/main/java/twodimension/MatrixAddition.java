package twodimension;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] answer = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] answer = matrixAddition.solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}});
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}
