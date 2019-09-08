package MedianOfTwoSortedArrays;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void When_Input_1_2_And_3_4_Then_Should_Return_2_Point_5() {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double median = medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(2.5, median, 0.01);
    }

    @Test
    public void When_Input_2_4_And_1_3_5_Then_Should_Return_3() {
        int[] num1 = new int[]{2, 4};
        int[] num2 = new int[]{1, 3, 5};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double median = medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2);
        Assert.assertEquals(3, median, 0.01);
    }
}