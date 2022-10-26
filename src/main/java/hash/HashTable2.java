package hash;

import java.util.ArrayList;
import java.util.List;


public class HashTable2 {
    class Node{
        private String key;
        private int value;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }
    private List<Node>[] table = new ArrayList[1000];

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
            this.table[hashIndex] = new ArrayList<>();
        }
        this.table[hashIndex].add(new Node(key,value));
    }

    public Integer search(String key){
        int hashIndex = hash(key);

        List<Node> nodeList = this.table[hashIndex];
        for(Node node : nodeList){
            if(key == node.getKey()){
                return node.getValue();
            }
        }
        return null;
    }
    public static void main(String[] args) {

        HashTable2 ht = new HashTable2();
        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon",2);

        System.out.println(ht.search("Yoonseo"));
        System.out.println(ht.search("Seoyoon"));
    }
}
