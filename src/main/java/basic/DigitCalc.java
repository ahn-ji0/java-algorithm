package basic;

import java.util.Scanner;

/* 코드업 1278 : 자릿수 계산 */

public class DigitCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            count ++;
            n /= 10;
        }
        System.out.println(count);
    }
}
