/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resp = new ArrayList<>();
        if(root == null)return resp;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            Double count = 0.0;
            Double sum = 0.0; 
            while(size>0){
                TreeNode temp = que.poll();
                count += 1;
                sum += temp.val;
                if(temp.right!=null)que.offer(temp.right);
                if(temp.left!=null)que.offer(temp.left);
                size--;
            }
            resp.add( sum/count);

        }
        return resp;

    }
}
// @lc code=end

