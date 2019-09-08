package TwoSum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                } else {
                    int sum = nums[i] + nums[j];
                    if (target == sum) {
                        return new int[]{j, i};
                    }
                }
            }
        }
        return null;
    }

}
