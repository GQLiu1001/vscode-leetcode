/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
 */

// @lc code=start

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> resp = new ArrayList<>();
        if(root == null) return  resp;
        Queue<TreeNode> que = new LinkedList();
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            int val = -2147483648 ;
            while( size > 0){
                TreeNode temp = que.poll();
                val = Math.max(temp.val, val);
                if(temp.right!=null)que.offer(temp.right);
                if(temp.left!=null)que.offer(temp.left);
                size--;
            }
            resp.add(val);
        }
        return resp;

        
    }
}
// @lc code=end

