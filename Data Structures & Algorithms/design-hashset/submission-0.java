class MyHashSet {

    private static final int SIZE = 1000;
    private LinkedList<Integer>[] buckets;
    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for(int i = 0;i<SIZE;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int hash(int key){
        return key % SIZE;
    }
    public void add(int key) {
        int idx = hash(key);
        for(int num : buckets[idx]){
            if(num == key) return;
        }
        buckets[idx].add(key);
    }
    
    public void remove(int key) {
        int idx = hash(key);
        for(int num : buckets[idx]){
            buckets[idx].remove(Integer.valueOf(key));
            return;
        }
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        for(int num : buckets[idx]){
            if(num == key) return true;
        }
        return false;
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */