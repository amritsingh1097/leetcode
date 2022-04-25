// Runtime: 17 ms, faster than 81.35% of Java online submissions for Design HashSet.
// Memory Usage: 56 MB, less than 73.26% of Java online submissions for Design HashSet.

class MyHashSet {
    
    class Node {
        int key;
        Node next;
        
        Node(int key) {
            this.key = key;
        }
    }
    
    final int size = 10000;
    Node[] buckets;

    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new Node[size];
    }
    
    public void add(int key) {
        if (!contains(key)) {
            int ind = getIndex(key);
            
            if (buckets[ind] == null) {
                buckets[ind] = new Node(key);
            } else {
                Node node = buckets[ind];
                while (node.next != null) node = node.next;
                node.next = new Node(key);
            }
        }
    }
    
    public void remove(int key) {
        if (contains(key)) {
            int ind = getIndex(key);
            
            if (buckets[ind].key == key) {
                buckets[ind] = buckets[ind].next;
            } else {
                Node node = buckets[ind];
                while (node.next != null && node.next.key != key) node = node.next;
                node.next = node.next.next;
            }
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int ind = getIndex(key);
        
        Node node = buckets[ind];
        while (node != null) {
            if (node.key == key) return true;
            
            node = node.next;
        }
        
        return false;
    }
    
    private int getIndex(int key) {
        return Integer.hashCode(key) % size;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
