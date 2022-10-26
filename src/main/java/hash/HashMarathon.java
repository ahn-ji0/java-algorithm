package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMarathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Set<String> hashSet = new HashSet<>();
        for(String p : participant){
            hashSet.add(p);
        }
        for(String c : completion){
            hashSet.remove(c);
        }
        Iterator<String> iter = hashSet.iterator();
        answer = iter.next();

        return answer;
    }

    public static void main(String[] args) {
        HashMarathon hm = new HashMarathon();
        String r = hm.solution(new String[]{"leo", "kiki", "eden"},new String[]{"eden", "kiki"});
        System.out.println(r);
    }
}
