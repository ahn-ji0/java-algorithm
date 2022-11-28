package combination;

public class AlphabetCombinationPractice {
    public static void printOne(){
        char start = 'A';
        while(start<='Z'){
            System.out.println(start);
            start = (char) (start + 1);
        }
    }
    public static void printTwo(){
        char first = 'A';
        while(first<='Z'){
            char second = 'A';
            while(second<='Z'){
                System.out.printf("%c%c\n",first,second);
                second = (char) (second+1);
            }
            first = (char) (first + 1);
        }
    }

    public static void main(String[] args) {
        printOne();
        printTwo();
    }
}
