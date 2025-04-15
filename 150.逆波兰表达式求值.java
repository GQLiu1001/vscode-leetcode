
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String right = "";
        String left = "";
        Integer rightNum = 0;
        Integer leftNum = 0;
        String res ="";
        for (String string : tokens) {
            switch (string) {
                case "+" -> {
                    right = stack.pop();
                    rightNum = Integer.valueOf(right); 
                    left = stack.pop();
                    leftNum = Integer.valueOf(left);
                    res = String.valueOf(leftNum+rightNum);
                    stack.push(res) ;
                }
                case "-" -> {
                    right = stack.pop();
                    rightNum = Integer.valueOf(right); 
                    left = stack.pop();
                    leftNum = Integer.valueOf(left);
                    res = String.valueOf(leftNum-rightNum);
                    stack.push(res) ;
                }
                case "*" -> {
                    right = stack.pop();
                    rightNum = Integer.valueOf(right); 
                    left = stack.pop();
                    leftNum = Integer.valueOf(left);
                    res = String.valueOf(leftNum*rightNum );
                    stack.push(res) ;
                }
                case "/" -> {
                    right = stack.pop();
                    rightNum = Integer.valueOf(right); 
                    left = stack.pop();
                    leftNum = Integer.valueOf(left);
                    res = String.valueOf(leftNum/rightNum);
                    stack.push(res) ;
                }
                default -> stack.push(string);
                    
            }


        }
        String resp = stack.pop();
        return  Integer.parseInt(resp);

        
    }
}
// @lc code=end

