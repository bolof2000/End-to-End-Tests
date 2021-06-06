package leetcode;

import io.cucumber.java.sl.In;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestAndSolutionsLeetcode {

  public static int[] twoSum(int[] nums,int target){
      Map<Integer, Boolean> map = new HashMap<>();
      /*

       */

     int[] resultfinal = new int[2];
      List<Integer> result = new ArrayList<>();

      for(int i=0;i<nums.length;i++)
      {    Integer num = nums[i];
          int temp = target-num;
          if(map.containsKey(temp)){
              result.add(temp);
              result.add(num);
          }else{
              map.put(num,true);
          }
      }

      for(int i=0;i<result.size();i++){
          resultfinal[i] = result.get(i);
      }

      return resultfinal;
  }
  public static ListNode addTwoNumber(ListNode l1,ListNode l2){
      ListNode dummy = new ListNode(0);
      ListNode output = dummy;
      int carry =0;

      while(l1!= null || l2 != null || carry!=0){
          if(l1 != null){
              carry += l1.val;
              l1 = l1.next;
          }
          if(l2 != null){
              carry += l2.val;
              l2 = l2.next;
          }

          dummy.next = new ListNode(carry%10);
          carry = carry/10;

          dummy = dummy.next;
      }

      return output.next;
  }

  public static int longestSubstringWithoutRepeatingCharacter(String s){
      int window_start =0;
      int maxlen =Integer.MIN_VALUE;
      Map<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          if(map.containsKey(ch) && map.get(ch) >= window_start){
              window_start = map.get(ch)+1;
          }
          map.put(ch,i);
          maxlen = Math.max(maxlen,i-window_start+1);
      }
      return maxlen;
  }

  public static String longestSubstringPalindrome(String s){
      String longest = "";
      for(int i=0;i<s.length();i++){
          for(int j=i+1;j<s.length();j++){
              String substring = s.substring(i,j);
              if(substring.length() > longest.length() && isPalindrome(substring)){
                  longest = substring;
              }
          }
      }
      return longest;
  }
  public static boolean isPalindrome(String s){
      int left =0;
      int right =s.length()-1;
      while(left<right){
          if(s.charAt(left) != s.charAt(right)){
              return false;
          }
          left +=1;
          right -=1;
      }
      return true;
  }

    public int myAtoi(String s) {

      if(s.length() ==0 || s == null){
          return 0;
      }

        s = s.trim();

        int result = 0;
        boolean isNegative = false;

        int startIndex = 0;
        if(s.charAt(0)=='+' || s.charAt(0) =='-'){
            startIndex +=1;
        }
        if(s.charAt(0) == '-'){
            isNegative = true;
        }

        for(int i=startIndex;i<s.length();i++){

            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                break;
            }
            int digitVal = (int)(s.charAt(i)-'0');
            result = result*10+digitVal;
        }

        if(isNegative){
            result = -result;
        }

        if(result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }

        return (int)(result);


  }


    @Test
    public void testRomanToInteger() {
        int expectedResult = romanToInt("LVIII");
        int actualResult = 58;
        Assert.assertEquals(expectedResult,actualResult);
    }

    public static int romanToInt(String s) {

      Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('x',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i=0; i<s.length();i++){
            if(i< s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }else{
                result +=map.get(s.charAt(i));
            }
        }

        return result;

    }



    @Test
    public void testlongestCommonPrefix() {
      String[] str = new String[]{"flower","flow","flight"};
      String expectedResult = longestCommonPrefix(str);
      String actualResult = "fl";
      Assert.assertEquals(expectedResult,actualResult);
    }


    public static String longestCommonPrefix(String[] strs){
      if(strs.length ==0) return "";
      String prefix = strs[0];
      for(int i=1;i<strs.length;i++){
          while(strs[i].indexOf(prefix) !=0){
              prefix = prefix.substring(0,prefix.length()-1);
          }
      }
        return prefix;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> actualResult = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            while(i==0 || i>0 && nums[i] != nums[i-1])
            {
                int left= i+1;
                int right = nums.length-1;

                while(left < right){
                    int temp = nums[i]+nums[left]+nums[right];
                    if(temp == 0){
                        actualResult.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left<right && nums[left] == nums[left+1]) left +=1;
                        while(left<right && nums[right] == nums[right-1]) right -=1;
                        left +=1;
                        right -=1;
                    }
                    else if(temp >0){
                        right -=1;
                    }
                    else{
                        left +=1;
                    }

                }

            }

        }
        return actualResult;
    }


    @Test
    public void testfibo() {
    }

    public static int fibo(int n){
      int[] dp = new int[]{0,1};

      for(int i=2;i<=n+1;i++){
          dp[i] = dp[i-1]+dp[i-2];
      }

      return dp[-1];

    }




}
