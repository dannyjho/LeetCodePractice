package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int begin = j + 1;
                        int end = nums.length - 1;
                        int newTarget = target - nums[i] - nums[j];
                        while (begin < end) {
                            if (nums[begin] + nums[end] == newTarget) {
                                result.add(Arrays.asList(nums[i], nums[j], nums[begin], nums[end]));
                                while (begin < end && nums[begin] == nums[begin + 1]) {
                                    begin++;
                                }
                                while (begin < end && nums[end] == nums[end - 1]) {
                                    end--;
                                }
                                begin++;
                                end--;
                            } else if (nums[begin] + nums[end] > newTarget) {
                                end--;
                            } else {
                                begin++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
