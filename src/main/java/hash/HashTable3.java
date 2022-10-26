package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashTable3 {

    private Map<String,Integer>[] table = new Map[1000];

    public int hash(String key){
        int count = 0;
        for(int i=0; i<key.length(); i++){
            count += key.charAt(i);
        }
        return count;
    }

    public void insert(String key, int value){
        int hashIndex = hash(key);
        if(this.table[hashIndex] == null){
            this.table[hashIndex] = new HashMap<>();
        }
        this.table[hashIndex].put(key,value);
    }

    public Integer search(String key){
        int hashIndex = hash(key);

        Map<String,Integer> hashMap = this.table[hashIndex];

        return hashMap.get(key);
    }

    public static void main(String[] args) {

        HashTable3 ht = new HashTable3();
        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon",2);

        System.out.println(ht.search("Yoonseo"));
        System.out.println(ht.search("Seoyoon"));
    }
}
