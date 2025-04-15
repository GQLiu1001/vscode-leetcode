/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int currentLoop = 1;
        int totalLoop = n/2;


        int count = 1;
        int[][] res = new int[n][n];
        while(currentLoop <= totalLoop){

            int startI = currentLoop -1;
            int startJ = currentLoop -1;
            int topCount = n - currentLoop;
            int rightCount = n -currentLoop;
            int bottomCount = n -currentLoop;
            int left = n-currentLoop;
            int leftCount = currentLoop - 1;
            for (int j = startJ; j < topCount ; j++) {
                res[startI][j] = count ++;
            }

            for (int i = startI; i < rightCount; i++) {
                res[i][rightCount] = count++;
            }

            for (int j = bottomCount; j >= currentLoop  ; j--) {
                res[bottomCount][j] = count++;
            }
            
            for (int i = left; i >= currentLoop ; i--) {
                res[i][leftCount] = count++;
            }


            currentLoop++;

        }

        if (n%2 != 0 ) {
            res[n/2][n/2] = count++;
        }

        return res;
    }
}
// @lc code=end

