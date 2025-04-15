
import java.security.DrbgParameters;

/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummyHead = new ListNode(666);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while(cur.next != null && cur.next.next != null ){
            ListNode left = cur.next;
            ListNode right = cur.next.next;
            cur.next = right;
            left.next = right.next;
            right.next = left;
            cur = left;


        }
        return dummyHead.next;
    }   
}
// @lc code=end

