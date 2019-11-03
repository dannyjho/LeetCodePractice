package ThreeSumClosest;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {
    @Test
    public void when_input_4_nums_and_target_is_1_then_closest_is_2() {
        int[] nums = new int[]{-1, 2, 1, -4};
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int mostClosestNum = threeSumClosest.threeSumClosest(nums, 1);
        Assert.assertEquals(2, mostClosestNum);
    }
}