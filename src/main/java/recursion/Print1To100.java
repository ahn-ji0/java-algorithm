package recursion;

public class Print1To100 {
    public static void print(int n){
        if(n>100) return;

        System.out.println(n);
        System.out.println("*".repeat(n));
        print(n+1);
    }

    public static void main(String[] args) {
        print(1);
    }
}
