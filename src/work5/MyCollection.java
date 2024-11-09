package work5;

import java.util.ArrayList;
import java.util.List;

/**
 * A collection that encapsulates an ArrayList and provides iterators.
 * Implements the MyIterableCollection interface.
 *
 * <p>This class represents the 'ConcreteAggregate' in the Iterator Pattern,
 * providing methods to create iterators that traverse its elements.</p>
 *
 * @param <T> the type of elements in this collection
 */
public class MyCollection<T> implements MyIterableCollection<T> {

    /**
     * The internal list that stores the elements.
     */
    private List<T> list;

    /**
     * Constructs an empty MyCollection.
     */
    public MyCollection() {
        this.list = new ArrayList<>();
    }

    /**
     * Adds an element to the collection.
     *
     * @param element the element to add
     */
    public void add(T element) {
        System.out.println("Method add called with element: " + element);
        list.add(element);
    }

    /**
     * Returns an iterator for normal sequential traversal.
     *
     * @return a MyIterator over the elements in the collection
     */
    @Override
    public MyIterator<T> iterator() {
        return new SequentialIterator<>(list);
    }

    /**
     * Returns an iterator for sequential traversal in an ordered structure.
     *
     * @return a MyIterator over the elements in the collection, in order
     */
    @Override
    public MyIterator<T> orderedIterator() {
        return new OrderedIterator<>(list);
    }
}
