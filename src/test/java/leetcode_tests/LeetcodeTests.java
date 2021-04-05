package leetcode_tests;

import leetcode_solutions.Solutions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetcodeTests {

    @Test
    public void testMinSubArrays(){
        int[] nums = new int[]{2,3,1,2,4,3};
        int actualResult = Solutions.minSubArrayLen(7,nums);
        Assert.assertEquals(actualResult,2);

    }
}
