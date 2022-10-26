package writeStars;

//별찍기 피라미드형
public class WritePyramid {
    public void printPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i; j++)
                System.out.print(" ");
            for(int k =0 ; k < 2*i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        WritePyramid writeTriangle = new WritePyramid();
        writeTriangle.printPyramid(4);
    }
}
