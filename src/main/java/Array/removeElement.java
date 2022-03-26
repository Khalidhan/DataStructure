package Array;

/**
 * Description:
 * Author:hzz
 * Date:2022-03-26
 * TIME:10:42
 */
public class removeElement {
    public static int removeElement01(int[] arr, int x) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                for (int j = i + 1; j < size; j++) {
                    arr[j - 1] = arr[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }

    public static int removeElement02(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {

    }
}
