/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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

    public void  preorder(TreeNode cur,List<Integer> resp){
        if(cur == null){
            return; //跳出条件？
        }
        resp.add(cur.val);
        preorder(cur.left,resp);//这里的 return 会返回到上一层的调用点
        preorder(cur.right, resp);
        
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resp = new ArrayList<>();
        preorder(root,resp);
        return resp;
    }
}
// @lc code=end

