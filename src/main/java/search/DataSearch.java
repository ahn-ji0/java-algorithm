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

        int idx = 0;
        boolean found = false;

        while(!found){
            if(arr[idx]==k){
                found = true;
            }
            idx ++;
        }
        if(found) System.out.println(idx);
        else System.out.println(-1);

    }
}
