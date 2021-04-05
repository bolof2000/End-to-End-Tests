package leetcode_solutions;

import java.util.*;

public class Solutions {
    public static int minSubArrayLen(int target, int[] nums) {

        if(nums== null || nums.length == 0) return 0;
        int maxLen = Integer.MAX_VALUE;
        int window_start =0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            sum +=nums[i];
            while (sum >=target){
                maxLen = Math.min(maxLen,i-window_start+1);
                sum -=nums[window_start];
                window_start++;
            }
        }
        if(maxLen == Integer.MAX_VALUE) return 0;
        return maxLen;
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }else if(i%3==0){
                result.add("Buzz");
            }else if(i%3==0){
                result.add("Buzz");
            }
            else{
                result.add(i +"");
            }
        }
        return result;
    }
    public static boolean rotateString(String A, String B) {
     if(A.length() ==0 && B.length()== 0) return true;
     for(Character s:A.toCharArray()){
         String firstLetter = A.substring(0,1);
         System.out.println(firstLetter);
         //System.out.print();
         String otherLetter = A.substring(1,A.length());
         A = otherLetter+firstLetter;
         System.out.println(A);
         if(A.equals(B)){
             return true;
         }
     }
     return false;
    }
    public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(Character c:s.toCharArray()){
        if(c == '(' || c== '{' || c== '['){
            stack.add(c);
        }else if(c == ')' && stack.peek() == '('){
            stack.pop();
        }
        else if(c == '}' && stack.peek() == '{'){
            stack.pop();
        }
        else if(c == ']' && stack.peek() == '['){
            stack.pop();
        }else{
            return false;
        }
    }
        return stack.size() <=0;
    }
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        ListNode output = dummy;
        ListNode current = head;
        dummy.next = head;
        while(current != null){
            if(current.val == val){
                current = current.next;
                dummy.next = head;
            }else{
                current = current.next;
                dummy = dummy.next;
            }
        }
        return output.next;
    }

    public static int longestPalindrome(String s){
        int pairs =0;
        Set<Character> set= new HashSet<>();
        for(Character c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }else{
                set.remove(c);
                pairs++;
            }
        }
        pairs = pairs*2;
        if(!set.isEmpty()) pairs++;

        return pairs;
    }
   public int pivotIndex(int[] nums){
        int sum =0;
        int cumSum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sum-nums[i] == 2*cumSum) return i;
            cumSum +=nums[i];
        }
   }

    public static void main(String[] args){
        //int[] nums = new int[]{2,3,1,2,4,3};
       // System.out.println(minSubArrayLen(7,nums));
      //  System.out.println(rotateString("abcde","abced"));
        //System.out.println(isValid("()["));
        //System.out.println(longestPalindrome("a"));
    }
}
