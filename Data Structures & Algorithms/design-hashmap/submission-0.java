class MyHashMap {

    class Pair{
        int key;
        int value;
        Pair(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private static final int SIZE = 1000;

    private LinkedList<Pair>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for(int i = 0;i<SIZE;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int hash(int key){
        return key % SIZE;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        for(Pair p : buckets[idx]){
            if (p.key == key) {
                p.value = value;
                return;
            }
        }
        buckets[idx].add(new Pair(key,value));
    }
    
    public int get(int key) { 
        int idx = hash(key);
        for(Pair p : buckets[idx]){
            if (p.key == key) {
                return p.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = hash(key);
        for(Pair p : buckets[idx]){
            if (p.key == key) {
                buckets[idx].remove(p);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */