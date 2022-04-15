package Array;

/**
 * Description:
 * Author:hzz
 * Date:2022-03-28
 * TIME:20:50
 */
public class generateMatrix_59 {

    public int[][] generateMatrix(int n) {
        int head = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int[][] matrix = new int[n][n];
        int num = 1;
        // 容易忘记 判断while循环的条件
        // 若没有等于 中间为空
        while(num <= n *n) {
            for (int i = left; i <= right; i++) {
                matrix[head][i] = num++;
            }
            head++;
            for (int i = head; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= head; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }

}
