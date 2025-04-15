
import javax.lang.model.util.ElementScanner14;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    boolean compare(TreeNode left , TreeNode right){
        if(left != null && right == null){return false;}
        else if(left == null && right != null){return false;} 
        else if(left == null && right == null){return true;}
        else if(left != null && right != null){
            if(left.val != right.val)return false;
        }

        boolean out = compare(left.left,right.right);
        boolean in = compare(left.right,right.left);
        return out&&in; 
    }
}
// @lc code=end

