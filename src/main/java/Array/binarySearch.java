package Array;

import java.util.Arrays;

/**
 * Description:
 * Author:hzz
 * Date:2022-03-25
 * TIME:11:09
 */
public class binarySearch {
    /**
     * 系统自带的
     * @param arr
     * @param x
     * @return 下标
     */
    public static int binarySearch01(int[] arr, int x){
        int i = Arrays.binarySearch(arr, x);
        if (i>0){
            return i;
        }else {
            return -1;
        }
    }

    /**
     * 自己实现， 需注意的是一定得是有序，无重复数字！
     * 往二分上考虑
     * 左闭又闭情形
     * @param arr
     * @param x
     * @return 下标
     */
    public static int binarySearch02(int[] arr, int x){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }


    /**
     * 左闭右开情况
     * @param arr
     * @param x
     * @return 下标
     */
    public static int binarySearch03(int[] arr, int x) {
        int right = arr.length;
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
//        int m = binarySearch01(arr, 9);
//        int n = binarySearch02(arr, 3);
        int n = binarySearch03(arr, 3);
        System.out.println(n);
    }
}
