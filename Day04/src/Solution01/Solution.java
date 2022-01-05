package Solution01;


/**
 * 566. 重塑矩阵
 */
class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //行数
        int m = mat.length;
        //列数
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] ints = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            //第i个元素的x坐标为i/列数
            // 1 3 4
            // 4 5 7
            // 第二个元素就为 [1/3][1%3]=[0][1]
            ints[i / c][i % c] = mat[i / n][i % n];
        }
        return ints;
    }
}