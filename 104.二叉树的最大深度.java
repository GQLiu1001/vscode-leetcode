/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth(TreeNode root) {
        int resp =0;
        if(root == null)return resp;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            while(size>0){
                TreeNode temp = que.poll();
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

