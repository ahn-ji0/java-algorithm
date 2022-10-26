package writeStars;

//별찍기 직각삼각형
public class WriteTriangleRecursive {
    public void printRow(int n){
        if(n==1){
            System.out.print("*");
            return;
        }
        printRow(n-1);
        System.out.print("*");
    }

    public void printTriangle(int n){
        if(n==0){
            return;
        }
        printTriangle(n-1);
        printRow(n);
        System.out.println();
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        WriteTriangleRecursive writeTriangle = new WriteTriangleRecursive();
        writeTriangle.printTriangle(5);
    }
}
