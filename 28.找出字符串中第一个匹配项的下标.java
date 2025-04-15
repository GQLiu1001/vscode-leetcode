/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return -1;  // 如果 needle 是空字符串，返回 0
        if (haystack.length() < needle.length()) return -1;  // 如果 haystack 比 needle 短，直接返回 -1

        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;  // 回溯到起始位置+1
                j = 0;
            }
        }
        if (j == needle.length()) {
            return i - j;  // 返回匹配的起始位置
        }
        return -1;
    }
}
// @lc code=end

