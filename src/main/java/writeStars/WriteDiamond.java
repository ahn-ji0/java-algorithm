package writeStars;

//별 찍기 다이아몬드
public class WriteDiamond {
    public void printDiamond(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i; j++)
                System.out.print(" ");
            for(int k =0 ; k < 2*i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i > 0; i--){
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
        WriteDiamond writeTriangle = new WriteDiamond();
        writeTriangle.printDiamond(4);
    }
}
