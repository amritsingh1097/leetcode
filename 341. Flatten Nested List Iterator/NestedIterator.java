// Runtime: 4 ms, faster than 75.40% of Java online submissions for Flatten Nested List Iterator.
// Memory Usage: 47.1 MB, less than 17.18% of Java online submissions for Flatten Nested List Iterator.

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    
    Queue<Integer> q;

    public NestedIterator(List<NestedInteger> nestedList) {
        q = new LinkedList<>();
        
        for (NestedInteger nestedInt : nestedList) {
            flattenList(nestedInt);
        }
    }
    
    private void flattenList(NestedInteger nestedInt) {
        if (nestedInt.isInteger()) {
            q.add(nestedInt.getInteger());
        } else {
            for (NestedInteger nested : nestedInt.getList()) {
                flattenList(nested);
            }
        }
    }

    @Override
    public Integer next() {
        return q.poll();
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
