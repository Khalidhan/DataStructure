package Array;

/**
 * Description:
 * Author:hzz
 * Date:2022-04-15
 * TIME:16:17
 */
public class isPerfectSquare_367 {
    public static boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        while (l < r){
            int mid = l + (r - l)/2 +1;
            if(mid * mid == num){
                return true;
            }else if(mid > num / mid){
                r = mid - 1;
            }else {
                l = mid;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean isP = isPerfectSquare(5);
        System.out.println(isP);
    }
}
