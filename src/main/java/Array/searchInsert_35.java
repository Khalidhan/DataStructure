package Array;

/**
 * Description:
 * Author:hzz
 * Date:2022-04-15
 * TIME:8:57
 */
public class searchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {

    }
}
