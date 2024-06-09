import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        List<String> fruits = new Stack<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        // Mengganti elemen terakhir menjadi "Strawberry"
        fruits.set(fruits.size() - 1, "Strawberry");

        // Menambahkan 3 buah baru
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Melakukan sorting
        Collections.sort(fruits);

        // Printing all elements using enhanced for-loop
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        // Pop elements until the stack is empty
        while (!((Stack<String>) fruits).isEmpty()) {
            System.out.printf("%s ", ((Stack<String>) fruits).pop());
        }

        // Menambahkan buah baru ke stack
        fruits.add("Melon");
        fruits.add("Durian");

        System.out.println();
        // Print the stack using an iterator
        for (Iterator<String> it = fruits.iterator(); it.hasNext(); ) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println();
        // Print the stack using a stream
        fruits.stream().forEach(e -> System.out.printf("%s ", e));
        System.out.println();

        // Print the stack using a for-loop with index access
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        System.out.println("\nBUILD SUCCESSFUL (total time: 0 seconds)");
    }
}
