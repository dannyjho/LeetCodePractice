package TwoSum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, 9);

        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}