package recursion;

public class Gcd {
    public static int gcd(int a, int b){
        if(a==b) return a;
        else if (a>b) return gcd(a-b,b);
        else return gcd(a,b-a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10,4));
    }
}
