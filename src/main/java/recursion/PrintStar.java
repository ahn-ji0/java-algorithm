package recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrintStar {
    public static void print(int n){
        if(n==0) return;
        System.out.print("*");
        print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
