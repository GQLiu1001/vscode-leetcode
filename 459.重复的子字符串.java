/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s+ s;
        String sas =  ss.substring(1,ss.length()-1);
        return sas.contains(s);

        // char[] ss = s.toCharArray();
        // int n = ss.length;
        
        // // 特殊情况处理
        // if (n == 1) {
        //     return false;
        // }
        // if (n == 2) {
        //     return ss[0] == ss[1];
        // }
        
        // // 尝试所有可能的子串长度（从 1 到 n/2）
        // for (int len = 1; len <= n / 2; len++) {
        //     if (n % len != 0) {
        //         continue; // 不能整除，无法构成重复子串
        //     }
            
        //     boolean isRepeated = true;
        //     for (int i = len; i < n; i++) {
        //         if (ss[i] != ss[i % len]) {
        //             isRepeated = false;
        //             break;
        //         }
        //     }
            
        //     if (isRepeated) {
        //         return true;
        //     }
        // }
        
        // return false;
    }
}
// @lc code=end

