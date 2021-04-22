package week4;

/**
 * @Author: Xiongyy
 * @Date: 2021/4/19 8:25
 * .............................................
 * 佛祖保佑             永无BUG
 */
public class NumberOfIslands {

    public static void main(String[] args) {
        NumberOfIslands n = new NumberOfIslands();
        char[][] grid = new char[][]{ {'1','1','1','1','0'},  {'1','1','0','1','0'},  {'1','1','0','0','0'}, {'0','0','0','0','0'}};

        System.out.println( n.numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length < 1) {
            return 0;
        }
        int rows = grid.length;
        int cells = grid[0].length;
        //初始化岛屿的数量
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                //如果当前节点为1，则岛屿数量加1,且把周围所有的节点变为0
                if(grid[i][j] == '1'){
                    dfsMark(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }


    private void dfsMark(char[][] grid, int row, int cell) {
        //处理中立条件
        if (row < 0 || cell < 0 || row >= grid.length || cell >= grid[0].length || grid[row][cell] != '1'){
            return;
        }
        //标记当前节点不为'1'
        grid[row][cell] = '0';
        //处理当前块的上节点
        dfsMark(grid, row - 1, cell);
        //处理当前节点的下节点
        dfsMark(grid, row + 1, cell);
        //处理当前节点的左节点
        dfsMark(grid, row, cell - 1);
        //处理当前节点的右节点
        dfsMark(grid, row, cell + 1);

    }


}
