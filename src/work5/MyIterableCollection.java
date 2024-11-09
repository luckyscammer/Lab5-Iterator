package work5;

/**
 * An interface for collections that can provide iterators.
 * Part of the Iterator Pattern implementation.
 *
 * <p>The IterableCollection interface declares the method(s) to create
 * iterator objects. This allows clients to obtain iterators that can
 * traverse the collection in different ways.</p>
 *
 * @param <T> the type of elements in the collection
 */
public interface MyIterableCollection<T> {
    /**
     * Returns an iterator over elements of type {@code T}.
     * Provides normal sequential traversal of the collection.
     *
     * @return an iterator for sequential traversal
     */
    MyIterator<T> iterator();

    /**
     * Returns an iterator over elements of type {@code T} in ordered sequence.
     * Provides sequential traversal in an ordered structure.
     *
     * @return an iterator for ordered traversal
     */
    MyIterator<T> orderedIterator();
}
