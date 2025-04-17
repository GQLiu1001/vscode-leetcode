/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
 */

// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resp = new ArrayList<>();
        if(root==null)return resp;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int tag =1 ;
            int size = que.size();
            while(size>0){
                TreeNode temp = que.poll();
                if(tag>0){
                    resp.add(temp.val);
                }
                if(temp.right != null)que.add(temp.right);
                if(temp.left != null)que.add(temp.left);
                size--;
                tag--;
            }
        }
        return resp;
    }
}
// @lc code=end

