/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resp = new ArrayList<>();
        if (root == null) return resp;
        
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> temp = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                Node node = que.poll();
                temp.add(node.val);
                
                // 遍历所有子节点，加入队列
                for (Node child : node.children) {
                    if (child != null) {
                        que.offer(child);
                    }
                }
            }
            
            resp.add(temp);
        }
        
        return resp;
    }
}
// @lc code=end

