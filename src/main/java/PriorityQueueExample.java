import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 5, 6, 6, 10, 11, 19));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 11, 12, 13));
        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(10, 12, 13, 14, 15, 17, 18));
        LinkedList<Integer> list4 = new LinkedList<>(Arrays.asList(3, 4, 7, 8, 10, 15, 20));
        LinkedList<Integer> list5 = new LinkedList<>(Arrays.asList(15, 16, 19, 20, 21, 22, 25));
        LinkedList<Integer>[] lists = new LinkedList[]{list1, list2, list3, list4, list5};
        LinkedList<Integer> result = mergeLists(lists);
        System.out.println(result);
    }

    private static LinkedList<Integer> mergeLists(LinkedList<Integer>[] lists) {
        PriorityQueue<LinkedList<Integer>> mins = new PriorityQueue<>(lists.length, Comparator.comparingInt(list -> list.getFirst()));
        for (int i=0; i<lists.length; i++) {
            if (!lists[i].isEmpty()) {
                mins.add(lists[i]);
            }
        }
        LinkedList<Integer> result = new LinkedList<>();
        while (!mins.isEmpty()) {
            LinkedList<Integer> listWithMin = mins.poll();
            Integer min = listWithMin.poll();
            result.addLast(min);
            if (!listWithMin.isEmpty()) {
                mins.add(listWithMin);
            }
        }
        return result;
    }
}
