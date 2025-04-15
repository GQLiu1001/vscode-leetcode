
import java.security.DrbgParameters;
import java.util.List;
import javax.naming.LinkException;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode() ;
        dummyHead.next = list1 ;
        ListNode dummyHead1 = new ListNode() ;
        dummyHead1.next = list2 ;
        ListNode i = dummyHead.next;
        ListNode j = dummyHead1.next ;

        if(i == null){return j;}
        if(j == null){return i;}

        // 确定新的头节点
        ListNode newHead = new ListNode();
        if (i.val <= j.val) {
            newHead = i;
            i = i.next;
        } else {
            newHead = j;
            j = j.next;
        }
        ListNode cur = newHead;
        while (i != null && j != null) {
            if (i.val <= j.val) {
                cur.next = i;
                i = i.next;
            } else {
                cur.next = j;
                j = j.next;
            }
            cur = cur.next;
        }

        // 处理剩余节点
        if (i != null) {
            cur.next = i;
        } else {
            cur.next = j;
        }
        
        return newHead;


    }
}
// @lc code=end

