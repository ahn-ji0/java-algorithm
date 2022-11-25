package recursion;

public class GcdWithoutRecursion {
    public static int gcd(int a, int b){
        while(a!=b){
            if(a>b) a-=b;
            else if(b>a) b-=a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(10,4));
    }
}
