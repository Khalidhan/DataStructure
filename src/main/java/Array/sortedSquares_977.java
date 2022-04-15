package Array;

import java.util.Arrays;

/**
 * Description:
 * Author:hzz
 * Date:2022-03-26
 * TIME:16:56
 *
 * 双指针： 左右两端 加 额外数组
 * 时间复杂度O(n)
 */
public class sortedSquares_977 {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int tmp = nums.length-1;
        while(left < right){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                result[tmp] = nums[left] * nums[left];
                left++;
                tmp--;
            }else {
                result[tmp] =  nums[right] * nums[right];
                right--;
                tmp--;
            }
        }
        result[tmp] = nums[right] * nums[right];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] squares = sortedSquares(arr);
        System.out.println(Arrays.toString(squares));
        System.out.println("xinjiaru");
    }
}
