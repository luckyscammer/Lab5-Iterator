package work5;

import java.util.List;

/**
 * An iterator that traverses the elements in the collection sequentially.
 * Implements the MyIterator interface.
 *
 * <p>This class represents the 'ConcreteIterator' in the Iterator Pattern,
 * providing sequential access to the elements of the collection.</p>
 *
 * @param <T> the type of elements returned by this iterator
 */
public class SequentialIterator<T> implements MyIterator<T> {

    /**
     * The list of elements to iterate over.
     */
    private List<T> list;

    /**
     * The current position in the list.
     */
    private int position;

    /**
     * Constructs a SequentialIterator over the specified list.
     *
     * @param list the list to iterate over
     */
    public SequentialIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    /**
     * Checks if there are more elements to iterate over.
     *
     * @return true if there are more elements
     */
    @Override
    public boolean hasNext() {
        System.out.println("SequentialIterator.hasNext() called");
        return position < list.size();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element
     */
    @Override
    public T next() {
        System.out.println("SequentialIterator.next() called");
        if (hasNext()) {
            return list.get(position++);
        } else {
            throw new IndexOutOfBoundsException("No more elements");
        }
    }
}
