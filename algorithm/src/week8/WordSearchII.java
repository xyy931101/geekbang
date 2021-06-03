package week8;

import java.util.LinkedList;
import java.util.List;

/**
 * 212. 单词搜索 II
 * @author: xiongyayun
 * @date: 2021/6/3 10:17 下午
 */
public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new LinkedList<>();
        if (words == null || words.length == 0) return res;
        Trie trie = new Trie();
        //构建前缀树
        for (String word : words) {
            trie.insert(word);
        }

        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(res, board, trie, "", i, j);
            }
        }
        return res;
    }

    private void dfs(List<String> res, char[][] board, Trie trie, String str, int i, int j) {
        //判断是否越界
        if (!legal(board, i, j) || trie == null) {
            return;
        }

        char ch = board[i][j];
        //已经走过得位置不能再走
        if (ch == '.') {
            return;
        }
        str += ch;
        trie = trie.getNext()[ch - 'a'];
        if (trie != null && trie.getEnd()) {
            res.add(str);
            //避免重复单词出现
            trie.setEnd(false);
        }
        //减去了状态数组的使用
        board[i][j] = '.';
        //遍历四元组
        dfs(res, board, trie, str, i - 1, j);
        dfs(res, board, trie, str, i + 1, j);
        dfs(res, board, trie, str, i, j - 1);
        dfs(res, board, trie, str, i, j + 1);

        //复原当前袁术
        board[i][j] = ch;
    }


    private boolean legal(char[][] board, int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
    }
}


