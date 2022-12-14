package hash;

import java.util.*;

// 시간 초과
public class HashMarathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();

        for(String p : participant){
//            if(!hashMap.containsKey(p)){
//                hashMap.put(p,1);
//            }
//            else {
//                hashMap.put(p, hashMap.get(p) + 1);
//            }

            hashMap.put(p,hashMap.getOrDefault(p,0)+1);

        }
        for(String c : completion){
            if(hashMap.get(c) == 1){
                hashMap.remove(c);
            }
            else{
                hashMap.replace(c,hashMap.get(c)-1);
            }
        }
        for(String key : hashMap.keySet()){
            answer = key;
        }

        return answer;
    }

    public static void main(String[] args) {
        HashMarathon hm = new HashMarathon();
        String r = hm.solution(new String[]{"leo", "kiki", "eden"},new String[]{"eden", "kiki"});
        System.out.println(r);
    }
}
