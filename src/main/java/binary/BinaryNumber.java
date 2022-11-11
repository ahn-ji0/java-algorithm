package binary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinaryNumber {
    public String solution(int num) {
        String binaryNum = "";
        while(num >= 1){
            binaryNum += num % 2;
            num = num / 2;
        }

        return binaryNum;
    }

    public static void main(String[] args) {
        BinaryNumber binaryNumber = new BinaryNumber();
        System.out.println(binaryNumber.solution(9));
    }
}
