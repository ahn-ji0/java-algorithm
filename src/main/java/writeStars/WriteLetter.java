package writeStars;

import java.util.Scanner;

//입력하는 letter 찍기(직각삼각형)
public class WriteLetter {
    private char letter;

    public WriteLetter(char letter){
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
    public void printTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j =0 ;j < i; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        WriteLetter writeLetter = new WriteLetter(letter);
        writeLetter.printTriangle(4);
    }
}
