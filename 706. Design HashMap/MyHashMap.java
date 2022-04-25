// Runtime: 14 ms, faster than 95.08% of Java online submissions for Design HashMap.
// Memory Usage: 47.5 MB, less than 95.83% of Java online submissions for Design HashMap.

class MyHashMap {
    
    class Node {
        int key;
        int val;
        Node next;
        
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    
    final int size = 10000;
    Node[] buckets;

    public MyHashMap() {
        buckets = new Node[size];
    }
    
    public void put(int key, int value) {
        int ind = getIndex(key);
        
        if (buckets[ind] == null) {
            buckets[ind] = new Node(key, value);
        } else if (buckets[ind].key == key) {
            buckets[ind].val = value;
        } else {
            Node node = getPrevNode(ind, key);

            if (node.next == null) node.next = new Node(key, value);
            else node.next.val = value;
        }
    }
    
    public int get(int key) {
        int ind = getIndex(key);
        
        if (buckets[ind] == null) return -1;
        if (buckets[ind].key == key) return buckets[ind].val;
        
        Node node = getPrevNode(ind, key);
        
        return (node.next == null) ? -1 : node.next.val;
    }
    
    public void remove(int key) {
        int ind = getIndex(key);
        
        if (buckets[ind] != null) {
            if (buckets[ind].key == key) {
                buckets[ind] = buckets[ind].next;
            } else {
                Node node = getPrevNode(ind, key);
                if (node.next != null) node.next = node.next.next;
            }
        }
    }
    
    private int getIndex(int key) {
        return Integer.hashCode(key) % size;
    }
    
    private Node getPrevNode(int ind, int key) {
        if (buckets[ind] == null) return null;
        
        Node node = buckets[ind];
        while (node.next != null && node.next.key != key) node = node.next;
        
        return node;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
