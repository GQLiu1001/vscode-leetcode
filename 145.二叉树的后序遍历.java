/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> resp = new ArrayList<>();
        post(root,resp);
        return resp;
    }
    public void post(TreeNode cur ,  List<Integer> resp){
        if(cur == null){
            return;
        }
        post(cur.left,resp);
        post(cur.right,resp);
        resp.add(cur.val);
    } 
}
// @lc code=end

