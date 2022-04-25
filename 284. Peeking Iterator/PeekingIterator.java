// Runtime: 4 ms, faster than 87.52% of Java online submissions for Peeking Iterator.
// Memory Usage: 42.2 MB, less than 80.38% of Java online submissions for Peeking Iterator.

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> iterator;
    boolean hasPeeked;
    Integer peekedElement;
    
	public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (hasPeeked) return peekedElement;
        
        hasPeeked = true;
        peekedElement = iterator.next();
        return peekedElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if (hasPeeked) {
            Integer next = peekedElement;
            peekedElement = null;
            hasPeeked = false;
            return next;
        }
        
        return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
	    return hasPeeked || iterator.hasNext();
	}
}
