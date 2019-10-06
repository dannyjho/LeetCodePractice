package ContainerWithMostWater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length<=0){
            return 0;
        }
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > 0; j--) {
                int minHeight = Math.min(height[i], height[j]);
                if (minHeight * (j - i) > maxArea) {
                    maxArea = minHeight * (j - i);
                }
            }
        }
        return maxArea;
    }
}
