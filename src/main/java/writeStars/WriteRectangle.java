package writeStars;

//별찍기 정사각형
public class WriteRectangle {
    public void printRectangle(int x, int y){
        for(int i = 0; i < x; i++){
            System.out.println("*".repeat(y));
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        WriteRectangle writeRectangle = new WriteRectangle();
        writeRectangle.printRectangle(2,4);
    }
}
