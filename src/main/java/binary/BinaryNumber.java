package binary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinaryNumber {

    public String solution(int num) {
        String binaryNum = "";
        while(num >= 1){
            binaryNum = num % 2 + binaryNum;
            num = num / 2;
        }

        return binaryNum;
    }

    public String solution2(int num) {
        List<Integer> binary = new ArrayList<>();
        while(num >= 1){
            binary.add(num % 2);
            num = num / 2;
        }
        Collections.reverse(binary);
        String binaryNum = binary.toString().replaceAll("[^0-9]","");;
        return binaryNum;
    }

    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        System.out.println(binaryNumber.solution(10));
//        System.out.println(binaryNumber.solution2(10));
    }
}
