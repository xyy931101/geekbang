package week5;

/**
 * @Author: Xiongyy
 * @Date: 2021/5/2 20:19
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cells = grid[0].length;

        int[][] result = new int[rows][cells];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (i == 0 && j == 0) {
                    result[i][j] = grid[i][j];
                }else if (i == 0) {
                    result[i][j] = result[i][j - 1] + grid[i][j];
                }else if (j == 0) {
                    result[i][j] = result[i - 1][j] + grid[i][j];
                }else {
                    result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
                }
            }
        }

        return result[rows -1][cells - 1];
    }
}
