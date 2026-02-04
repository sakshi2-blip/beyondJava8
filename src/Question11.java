import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class Question11 {


    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();


        map.putLast(2, "Two");
        map.putLast(3, "Three");
        map.putFirst(1, "One");
        map.putLast(4, "Four");

        System.out.println("Initial Map: " + map);


        Map.Entry<Integer, String> first = map.firstEntry();
        Map.Entry<Integer, String> last = map.lastEntry();

        System.out.println("First Entry: " + first);
        System.out.println("Last Entry: " + last);


        Map.Entry<Integer, String> removedFirst = map.pollFirstEntry();
        System.out.println("Removed First Entry: " + removedFirst);
        System.out.println("After pollFirstEntry: " + map);


        Map.Entry<Integer, String> removedLast = map.pollLastEntry();
        System.out.println("Removed Last Entry: " + removedLast);
        System.out.println("After pollLastEntry: " + map);


        SequencedMap<Integer, String> reversedMap = map.reversed();
        System.out.println("Reversed Map View: " + reversedMap);


        reversedMap.putFirst(99, "Ninety Nine");
        System.out.println("After adding to reversed map:");
        System.out.println("Original Map: " + map);
        System.out.println("Reversed Map: " + reversedMap);
    }

}
