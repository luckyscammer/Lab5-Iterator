package work5;

/**
 * An interface for iterators over a collection of elements.
 * Part of the Iterator Pattern implementation.
 *
 * <p>The Iterator interface defines the methods required for
 * sequentially accessing elements in a collection without
 * exposing its underlying representation.</p>
 *
 * @param <T> the type of elements returned by this iterator
 */
public interface MyIterator<T> {
    /**
     * Checks if the iteration has more elements.
     *
     * @return true if there are more elements to iterate over
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element
     */
    T next();
}
