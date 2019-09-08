package MedianOfTwoSortedArrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int[] combineArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            combineArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            combineArray[nums1.length + i] = nums2[i];
        }
        Arrays.sort(combineArray);
        int middlePoint = combineArray.length / 2;
        if (combineArray.length % 2 == 0) {
            result = (combineArray[middlePoint] + combineArray[middlePoint - 1]) / 2.0;
        } else {
            result = combineArray[middlePoint];
        }
        return result;
    }
}
