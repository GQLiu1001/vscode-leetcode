/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;
        while(i<j){
            char temp = s[i]; 
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        
    }
}
// @lc code=end

