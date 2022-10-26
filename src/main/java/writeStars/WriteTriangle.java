package writeStars;

//별찍기 직각삼각형
public class WriteTriangle {
    public void printTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j =0 ;j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        WriteTriangle writeTriangle = new WriteTriangle();
        writeTriangle.printTriangle(4);
    }
}
