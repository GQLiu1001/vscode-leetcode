/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resp = new ArrayList<>();
        if (root == null) {
            return resp; // 处理空树情况
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) { // 检查队列是否为空
            List<Integer> eachResp = new ArrayList<>(); // 每层新建一个列表
            int size = que.size();

            while (size != 0) {
                TreeNode tempNode = que.poll();
                eachResp.add(tempNode.val);
                if (tempNode.left != null) {
                    que.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    que.offer(tempNode.right);
                }
                size--;
            }
            resp.add(eachResp); // 添加当前层结果
        }
        return resp;
    }
}
// @lc code=end

