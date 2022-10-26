package hash;

import java.util.ArrayList;
import java.util.List;


public class HashTable2 {
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size = 200;
    List<Node>[] table = new ArrayList[size];

    public HashTable2() {
    }

    public HashTable2(int size) {
        this.table = new ArrayList[size];
    }

    public Integer search(String key){
        List<Node> nodes = this.table[hash(key)];
        for(Node node : nodes){
            if(key.equals(node.getKey()))
                return node.value;

        }
        return null;
    }
    public void insert(String key, int value){
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null){
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key,value));
    }

    public int hash(String str){
        int asciisum = 0;
        for(int i=0;i<str.length();i++){
            asciisum += str.charAt(i);
        }
        return asciisum % this.size;
    }
    public static void main(String[] args) {

        HashTable2 ht = new HashTable2();
        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon",2);

        System.out.println(ht.search("Yoonseo"));
        System.out.println(ht.search("Seoyoon"));
    }
}
