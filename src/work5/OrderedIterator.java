package work5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * An iterator that traverses the elements in the collection in an ordered sequence.
 * Implements the MyIterator interface.
 *
 * <p>This class represents another 'ConcreteIterator' in the Iterator Pattern,
 * providing ordered access to the elements of the collection based on their natural ordering
 * or their string representation.</p>
 *
 * @param <T> the type of elements returned by this iterator
 */
public class OrderedIterator<T> implements MyIterator<T> {

    /**
     * The list of elements to iterate over, sorted.
     */
    private List<T> sortedList;

    /**
     * The current position in the sorted list.
     */
    private int position;

    /**
     * Constructs an OrderedIterator over the specified list.
     * The elements are sorted using their natural ordering if they implement Comparable,
     * or using their toString() representation otherwise.
     *
     * @param list the list to iterate over
     */
    public OrderedIterator(List<T> list) {
        System.out.println("OrderedIterator constructed");
        this.sortedList = new ArrayList<>(list);
        sortList();
        this.position = 0;
    }

    /**
     * Sorts the list based on natural ordering or toString() representation.
     */
    private void sortList() {
        System.out.println("OrderedIterator.sortList() called");
        if (!sortedList.isEmpty()) {
            T firstElement = sortedList.get(0);
            if (firstElement instanceof Comparable) {
                // Suppress unchecked warnings due to generic casting
                @SuppressWarnings("unchecked")
                Comparator<T> comparator = (Comparator<T>) Comparator.naturalOrder();
                Collections.sort(sortedList, comparator);
            } else {
                Collections.sort(sortedList, Comparator.comparing(Object::toString));
            }
        }
    }

    /**
     * Checks if there are more elements to iterate over.
     *
     * @return true if there are more elements
     */
    @Override
    public boolean hasNext() {
        System.out.println("OrderedIterator.hasNext() called");
        return position < sortedList.size();
    }

    /**
     * Returns the next element in the ordered iteration.
     *
     * @return the next element
     */
    @Override
    public T next() {
        System.out.println("OrderedIterator.next() called");
        if (hasNext()) {
            return sortedList.get(position++);
        } else {
            throw new IndexOutOfBoundsException("No more elements");
        }
    }
}
