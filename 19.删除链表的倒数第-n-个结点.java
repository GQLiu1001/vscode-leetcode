
import java.security.DrbgParameters;

/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int tag = 0;
        ListNode dummyHead = new ListNode(999);
        ListNode cur = dummyHead;
        dummyHead.next = head;
        while(cur.next !=  null){
            cur = cur.next;
            tag ++;
        }
        ListNode cur1 = dummyHead;
        dummyHead.next = head;
        int num = tag - n; 
        while(num > 0){
            cur1 = cur1.next;
            num--;
        }
        cur1.next = cur1.next.next;
        return dummyHead.next;
    }
}
// @lc code=end

