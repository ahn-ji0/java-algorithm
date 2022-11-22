package recursion;

import java.util.Scanner;

public class DigitSum {
    public static Long digitAdd(Long n){
        if(n == 0){
            return 0L;
        }
        Long sum = n % 10 + digitAdd((Long) n/10);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        System.out.println(digitAdd(n));
    }
}
