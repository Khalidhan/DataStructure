package Array;

/**
 * Description:
 * Author:hzz
 * Date:2022-04-15
 * TIME:15:25
 *
 *  本题 if、else 的逻辑区间的划分方式是：[left..mid - 1] 与 [mid..right]。
 *  如果 mid 下取整，在区间只有 22 个数的时候有 mid 的值等于 left，
 *  一旦进入分支 [mid..right] 区间不会再缩小，出现死循环。
 *
 */
public class mySqrt_69 {
    public static int mySqrt(int x) {

        int left = 0, right = x;
        while(left<right){
            int mid = left+(right-left)/2 + 1;
            if(mid>x/mid) right = mid-1;
            else left = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int x = mySqrt(8);
    }
}
