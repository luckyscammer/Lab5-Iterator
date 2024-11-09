import work5.*;

/**
 * A class to demonstrate the usage of MyCollection and its iterators.
 *
 * <p>This class creates a collection, adds elements to it, and then
 * iterates over the elements using both the sequential and ordered iterators.</p>
 */
public class Main {

    /**
     * The main method to execute the example.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("banana");
        collection.add("apple");
        collection.add("cherry");

        System.out.println("Sequential Iterator:");
        MyIterator<String> seqIterator = collection.iterator();
        while (seqIterator.hasNext()) {
            String element = seqIterator.next();
            System.out.println("Element: " + element);
        }

        System.out.println("\nOrdered Iterator:");
        MyIterator<String> ordIterator = collection.orderedIterator();
        while (ordIterator.hasNext()) {
            String element = ordIterator.next();
            System.out.println("Element: " + element);
        }
    }
}
