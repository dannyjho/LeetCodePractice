package FourSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FourSumTest {
    @Test
    public void targetIs0() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> results = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(new Integer[]{-2, -1, 1, 2}));
        expected.add(Arrays.asList(new Integer[]{-2,  0, 0, 2}));
        expected.add(Arrays.asList(new Integer[]{-1,  0, 0, 1}));
        Assert.assertEquals(expected,results);
    }
}
