import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "five");
        hashMap.put(3, "three");
        hashMap.put(1, "one");
        hashMap.put(4, "four");
        hashMap.put(2, "two");
        System.out.println(hashMap);

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(5, "five");
        linkedHashMap.put(3, "three");
        linkedHashMap.put(1, "one");
        linkedHashMap.put(4, "four");
        linkedHashMap.put(2, "two");
        System.out.println(linkedHashMap);
    }
}
