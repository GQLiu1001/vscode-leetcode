
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resp = new ArrayList<>(); 
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null)return resp;
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = que.size();
            while(size>0){
                TreeNode tempNode = que.poll();
                temp.add(tempNode.val);
                if(tempNode.left!=null)que.add(tempNode.left);
                if(tempNode.right!=null)que.add(tempNode.right);
                size--;
            }
            resp.add(temp);
        }
        List<List<Integer>> resp1 = new ArrayList<>(); 
        for (int i = resp.size()-1; i >= 0 ; i--) {
            resp1.add(resp.get(i));
            
        }
        return resp1;

    }
}
// @lc code=end

