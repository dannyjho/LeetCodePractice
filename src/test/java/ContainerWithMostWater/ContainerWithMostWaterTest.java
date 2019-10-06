package ContainerWithMostWater;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
    @Test
    public void When_Input_Array_Of_Numbers_Then_Should_Return_Max_Area() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int area = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assert.assertEquals(49, area);
    }

    @Test
    public void When_Input_Empty_Array_Then_Should_Return_0() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int area = containerWithMostWater.maxArea(new int[]{});
        Assert.assertEquals(0, area);
    }
}