package leetcode_tests;

import java.util.*;

public class CollectionsTest {
    /*
    Set
    Queue
    Map
    Stack
    ArrayList

     */
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 3, 5, 6, 7};
        String s = "bolofinde";

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

           // System.out.println(map.keySet());
          //  System.out.println(map.values());
          //  System.out.println(map.entrySet());
           // System.out.println(map.remove(3));

            Queue<Integer> minHeap = new PriorityQueue<>();
            minHeap.add(num);
            Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
            maxHeap.add(num);
            Stack<Integer> stack = new Stack<>();
            stack.add(num);
            Set<Integer> set = new HashSet<>();
            set.add(num);
            List<Integer> list = new ArrayList<>();
            list.add(num);
            List<Integer> list2 = new LinkedList<>();
            list2.add(num);

            for(Character c:s.toCharArray()){
                Queue<Character> minHeapC = new PriorityQueue<>();
                minHeap.add(num);
                Queue<Character> maxHeapC = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
                maxHeap.add(num);
                Stack<Character> stackC = new Stack<>();
                stack.add(num);
                Set<Character> setC = new HashSet<>();
                set.add(num);
                List<Character> listC = new ArrayList<>();
                list.add(num);
                List<Character> listC2 = new LinkedList<>();
                list2.add(num);
            }
        }
    }
}
