package ThreeSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {
    @Test
    public void when_input_then_should_return_size_2_list() {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(input);
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        list1.add(-1);
        list1.add(0);
        list1.add(1);
        list2.add(-1);
        list2.add(-1);
        list2.add(2);
        List<List<Integer>> expectedResult = new ArrayList<List<Integer>>();
        expectedResult.add(list2);
        expectedResult.add(list1);
        Assert.assertEquals(expectedResult,lists);
    }
}