import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Create a Vector and add elements
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");

        // Use contains(Object elem) to check if an element exists
        String elementToCheck = "Banana";
        boolean containsElement = vector.contains(elementToCheck);
        System.out.println("Does the Vector contain '" + elementToCheck + "'? " + containsElement);

        // Use indexOf(Object elem) to find the index of an element
        String elementToFind = "Cherry";
        int index = vector.indexOf(elementToFind);
        System.out.println("Index of '" + elementToFind + "' in the Vector: " + index);

        // Use size() to get the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);
    }
}
