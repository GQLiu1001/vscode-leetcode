/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0 ){
            return false;
        }
        Stack<String> stack = new Stack<>();
        try{
        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case '(' -> stack.push(")");
                case '{' -> stack.push("}");
                case '[' -> stack.push("]");
                case ')' -> {
                    if(")".equals(stack.peek())){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                case '}' -> {

                    if("}".equals(stack.peek())){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                case ']' -> {

                    if("]".equals(stack.peek())){
                        
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                default -> throw new AssertionError();
                
            }
        }}
        catch(Exception e){
            return false;
        }
        try {
            stack.peek();
            return  false;
        } catch (Exception e) {
            // TODO: handle exception
            return true; 
        }
    }
}
// @lc code=end

