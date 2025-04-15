/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
//初始化一个空的待操作的链表
    private Node head;  // 真正的头结点
    private int size;   // 记录链表长度

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /** 获取 index 位置的值 */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node dummyHead = new Node(-1); // 创建虚拟头结点
        dummyHead.next = head;         // 让它指向真实的 head
        Node cur = dummyHead.next;
        while(index >0){
            cur = cur.next;
            index--;
        }

        return cur.val;
    }

    /** 在头部插入 */
    public void addAtHead(int val) {
        Node dummyHead = new Node(-1);
        dummyHead.next = head; // 连接真实 head
        Node newNode = new Node(val);
        newNode.next = dummyHead.next; // 插入到 dummyHead 后面
        dummyHead.next = newNode;
        head = dummyHead.next; // 更新 head
        size++;
    }

    /** 在尾部插入 */
    public void addAtTail(int val) {
        Node dummyHead = new Node(-1);
        dummyHead.next = head;
        Node cur = dummyHead;

        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(val);

        head = dummyHead.next; // 更新 head
        size++;
    }

    /** 在 index 位置插入 */
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node dummyHead = new Node(-1);
        dummyHead.next = head;
        Node cur = dummyHead;

        while(index >0){
            cur = cur.next;
            index--;
        }


        Node newNode = new Node(val);
        newNode.next = cur.next;
        cur.next = newNode;

        head = dummyHead.next; // 更新 head
        size++;
    }

    /** 删除 index 位置的节点 */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        Node dummyHead = new Node(-1);
        dummyHead.next = head;
        Node cur = dummyHead;
        while(index >0){
            cur = cur.next;
            index--;
        }

        cur.next = cur.next.next;

        head = dummyHead.next; // 更新 head
        size--;
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

