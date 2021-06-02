package week8;

/**
 * 前缀树的实现leetcode208
 * @author: xiongyayun
 * @date: 2021/6/2 10:51 下午
 */
public class Trie {
    private boolean isEnd;
    //这里26个next代表着26个字符
    private Trie[] next;

    public Trie() {
        next = new Trie[26];
    }

    public void insert(String word) {
        //边界值的判断
        if (word == null || word.length() == 0) return;
        char[] chars = word.toCharArray();
        Trie curr = this;
        for (int i = 0; i < chars.length; i++) {
            //当前字符的位置
            int n = chars[i] - 'a';
            //判断next里面是有又当前字符的占位
            if (curr.next[n] == null) curr.next[n] = new Trie();
            curr = curr.next[n];
        }
        //因为遍历完所有的字符,所以结束位标识要为true
        curr.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        //找到结束位的node,并且存在结束位的标识为true
        return node != null && node.isEnd;
    }

    private Trie searchPrefix(String word) {
        //边界值判断
        if (word == null) return null;
        char[] chars = word.toCharArray();
        Trie curr = this;
        for (int i = 0; i < chars.length; i++) {
            int n = chars[i] - 'a';
            //如果当前树中不包含遍历中的元素,则直接返回空
            if (curr.next[n] == null) return null;
            curr = curr.next[n];
        }
        return curr;
    }

    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);
        return node != null;
    }
}
