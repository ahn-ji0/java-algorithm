package search;

import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();


        for(int idx = 0 ; idx < n ; idx ++){
            if(arr[idx]==k){
                System.out.println(idx+1);
                return;
            }
        }
        System.out.println(-1);

    }
}
