package HashMap;
import java.util.*;
public class implementOwnHashMap {
    static class myHashmap<K, V>{
        public static final int default_capacity = 4;
        public static final float default_loadfactor = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;
        private void initbuckets(int n){
            buckets = new LinkedList[n];
            for (int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        private int hashfunction(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        private int searchInBucket(LinkedList<Node>currbucket, K key){
            for (int i =0;i < currbucket.size();i++){
                if (currbucket.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public myHashmap(){
            initbuckets(default_capacity);
        }
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }
        private void rehash(){
            LinkedList<Node>[] oldbuckets = buckets;
            initbuckets(oldbuckets.length * 2);
            n=0;
            for (var bucket : oldbuckets){
                for (var node : bucket){
                    put(node.key, node.value);
                }
            }
        }
        public int size(){
            return n;
        }
        public void put(K key , V value){
            int bi = hashfunction(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = searchInBucket(currbucket,key);
            if (ei == -1) {
                Node node = new Node(key , value);
                currbucket.add(node);
                n++;
            } else {
                Node currnode = currbucket.get(ei);
                currnode.value=value;
            }
        }
        public V get(K key){
            int bi = hashfunction(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = searchInBucket(currbucket, key);
            if (ei != -1){
                Node currnode = currbucket.get(ei);
                return currnode.value;
            }
            return null;
        }
        public V remove(K key){
            int bi = hashfunction(key);
            LinkedList<Node> currbucket = buckets[bi];
            int ei = searchInBucket(currbucket,key);
            if (ei != -1) {
                Node currnode = currbucket.get(ei);
                V val = currnode.value;
                currbucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }
    public static void main(String[] args) {
        myHashmap<String, Integer> map = new myHashmap<String, Integer>();
        System.out.println("testing put");
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println("CAPACITY : " + map.capacity());
        System.out.println("LOAD : " + map.load());
        map.put("x",61);
        map.put("y",71);
        map.put("c", 30);
        System.out.println("testing Size : " + map.size());
        // Testing get
//        System.out.println("Testing values : " + map.get("a"));
//        System.out.println("Testing values : " + map.get("b"));
//        System.out.println("Testing values : " + map.get("c"));
//        System.out.println("Testing values : " + map.get("d"));
//        System.out.println("Testing remove : " + map.remove("c"));
//        System.out.println("Testing remove : " + map.remove("c"));
//        System.out.println("testing Size : " + map.size());

        System.out.println("Testing values : " + map.get("x"));
        System.out.println("Testing values : " + map.get("y"));

        System.out.println("CAPACITY : " + map.capacity());
        System.out.println("LOAD : " + map.load());
    }

}
