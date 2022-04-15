package Array;

import sun.rmi.server.InactiveGroupException;

/**
 * Description:
 * Author:hzz
 * Date:2022-03-27
 * TIME:19:11
 *
 * 滑动窗口
 *1、窗口内是什么？
 *2、如何移动窗口的起始位置？
 *3、如何移动窗口的结束位置？
 *
 * 解题的关键在于 窗口的起始位置如何移动
 */
public class minSubArrayLen_209 {
    public static int minSubArrayLen(int target, int[] nums){
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target){
                len = right - left +1;
                sum -= nums[left++];
                result = len < result ? len : result;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,4};
        int i = minSubArrayLen(4, arr);
        System.out.println(i);
    }
}
