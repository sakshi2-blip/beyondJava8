import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Question10 {

    public static void main(String[] args) {

        SequencedSet<String> set = new LinkedHashSet<>();


        set.addFirst("C");
        set.addLast("Java");
        set.addLast("Python");
        set.addFirst("C++");

        System.out.println("Set after additions: " + set);


        System.out.println("First element: " + set.getFirst());
        System.out.println("Last element: " + set.getLast());


        set.removeFirst();
        set.removeLast();

        System.out.println("Set after removals: " + set);


        SequencedSet<String> reversedSet = set.reversed();
        System.out.println("Reversed set view: " + reversedSet);
    }
}
