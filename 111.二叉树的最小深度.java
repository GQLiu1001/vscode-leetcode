/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start
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
    public int minDepth(TreeNode root) {
        int resp =0;
        if(root == null)return resp;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        resp += 1;
        while(!que.isEmpty()){
            int size = que.size();
            while(size>0){
                TreeNode temp = que.poll();
                if(temp.left == null && temp.right==null)return resp;
                if(temp.right!=null)que.offer(temp.right);
                if(temp.left!=null)que.offer(temp.left);
                size--;
            }
            resp += 1;

        }
        return resp;

    }
}
// @lc code=end

