package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static leetcode.TestAndSolutionsLeetcode.*;

public class TestLeetcode {

    @Test
    public void longestSubstringTest(){

        int expectedResult = longestSubstringWithoutRepeatingCharacter("abcabcbb");
        int actualResult = 3;
        //Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testlongestPalindromeSubstring(){

        String expectedResult = longestSubstringPalindrome("babad");
        String actualResult = "bab";
      Assert.assertEquals(expectedResult,actualResult);
    }




}

