package week9;

import java.util.HashMap;

/**
 * @author: xiongyayun
 * @date: 2021/6/6 7:23 下午
 */
public class LRUCache {
    private int capacity;
    private HashMap<Integer, CacheNode> map;
    private CacheNode head;
    private CacheNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    public int get(int key) {
        CacheNode cacheNode = map.get(key);
        //讲最新get的元素移位head节点
        if (cacheNode != null) {
            moveToHead(cacheNode);
            return cacheNode.value;
        }
        return -1;
    }

    private void moveToHead(CacheNode cacheNode) {
        //如果当前节点为头结点,则直接跳过
        if (head == cacheNode) {
            return;
        }
        CacheNode pre = cacheNode.pre;
        CacheNode next = cacheNode.next;
        //当前指针的前节点为当前节点的下个节点
        if (pre != null) pre.next = next;
        //当前指针的下个节点的前节点,为当前指针的前节点
        if (next != null) next.pre = pre;
        //如果当前节点为尾节点，则把tail节点设置尾当前节点的前节点
        if (cacheNode == tail) tail = tail.pre;
        if (head == null || tail == null) {
            tail = cacheNode;
            head = cacheNode;
            return;
        }
        //设置当前节点为头节点
        head.pre = cacheNode;
        cacheNode.next = head;
        head = cacheNode;
        head.pre = null;
    }

    public void put(int key, int value) {
        CacheNode cacheNode = map.get(key);
        if (cacheNode == null) {
            cacheNode = new CacheNode(key, value);
            if (map.size() >= capacity) {
                removeLast();
            }
        }else {
            cacheNode.value = key;
        }
        map.put(key, cacheNode);

        moveToHead(cacheNode);
    }

    private void removeLast() {
        if (tail != null) {
            //先移除map里面的值
            map.remove(tail.key);
            tail = tail.pre;
            if (tail == null) {
                head = null;
            }else {
                tail.next = null;
            }
        }
    }
}

class CacheNode{
    CacheNode pre;
    CacheNode next;
    Integer value;
    Integer key;

    public CacheNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
