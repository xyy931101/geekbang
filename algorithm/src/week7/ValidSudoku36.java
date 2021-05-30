package week7;

import java.util.HashMap;

/**
 * @author: xiongyayun
 * @date: 2021/5/30 15:19
 */
public class ValidSudoku36 {

    public boolean isValidSudoku(char[][] board) {
        //表示行的所有的值
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        //表示列的所有的值
        HashMap<Integer, Integer> [] columns = new HashMap[9];
        //表示每个数组里面的数字
        HashMap<Integer, Integer> [] boxes = new HashMap[9];

        //初始化各个数组
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<Integer, Integer>();
            columns[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    int n = (int)num;
                    int box_index = (i / 3 ) * 3 + j / 3;
                    //行那边+1
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    //列那边+1
                    columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);

                    boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

                    if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1)
                        return false;

                }

            }
        }
        return true;
    }

    //the best
    public boolean isValidSudoku2(char[][] board) {
        int [][]row  = new int[9][10];
        int [][]col  = new int[9][10];
        int [][]box  = new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.'){
                    continue;
                }

                int curNum = board[i][j]-'0';
                //行里面
                if (row[i][curNum]==1){
                    return false;
                    //列里面
                }if (col[j][curNum]==1){
                    return false;
                }
                //有没有在相应的box中出现过
                if (box[j/3 + (i/3) * 3][curNum]==1){
                    return false;
                }
                row[i][curNum]=1;
                col[j][curNum]=1;
                box[j/3 + (i/3) * 3][curNum]=1;
            }
        }
        return true;
    }
}
