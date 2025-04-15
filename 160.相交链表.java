/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode pA = headA;
        ListNode pB = headB;
        
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        
        return pA; // 返回相交点（或 null）
        
        // ListNode i = headA;
        // ListNode j = headB;
        // while(i!=null){
        //     ListNode temp = j;
        //     while (temp!=null) {
        //         if(temp != i){
        //             temp=temp.next;
        //         }else{
        //             return temp;
        //         }
        //     }
        //     i=i.next;
        // }

        // return null;
    }
}
// @lc code=end

