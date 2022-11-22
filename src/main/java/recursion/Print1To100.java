package recursion;

public class Print1To100 {
    public static void print(int n){
        if(n>100) return;

        System.out.println(n);
        print(n+1);
    }

    public static void main(String[] args) {
        Print1To100 print1To100 = new Print1To100();
        print1To100.print(1);
    }
}
