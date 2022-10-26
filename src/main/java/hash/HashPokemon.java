package hash;

import java.util.HashSet;
import java.util.Set;

public class HashPokemon {
    public int solution(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        if (hashSet.size() >= nums.length / 2){
            return nums.length / 2;
        }
        else{
            return hashSet.size();
        }
    }

    public static void main(String[] args) {
        HashPokemon hashPokemon = new HashPokemon();
        int num = hashPokemon.solution(new int[] {3,1,2,3});
        System.out.println(num);
    }
}
