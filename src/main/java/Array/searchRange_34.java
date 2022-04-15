package Array;

/**
 * Description:
 * Author:hzz
 * Date:2022-04-15
 * TIME:9:39
 *
 * 双指针
 */
public class searchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == target && nums[right] == target) {
                return new int[]{left, right};
            }
            if (nums[left] < target) {
                left++;
            }
            if (nums[right] > target) {
                right--;
            }

        }
        return new int[]{-1, -1};


    }
}
