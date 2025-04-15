/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int tag = 10001;
        ListNode cur = head;
        while(tag>0){
            if(cur == null){
                return false;
            }
            cur = cur.next;

            tag --;
        }

        return true;
    }
}
// @lc code=end

