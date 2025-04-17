
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur =head;
        while(cur!=null){
            stack.add(cur.val);
            cur = cur.next;
        }
        StringBuilder s = new StringBuilder();
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        int j = s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            System.out.println("进入循环");
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                j--;

            }

        }

        return true;
    }
}
// @lc code=end

