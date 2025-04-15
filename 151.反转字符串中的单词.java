/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start


class Solution {
    public String reverseWords(String s) {

                // 去除前导和 trailing 空格，并按一个或多个空格分割
                String[] words = s.trim().split("\\s+");
                StringBuilder res = new StringBuilder();
                
                // 从后向前遍历单词
                for (int i = words.length - 1; i >= 0; i--) {
                    res.append(words[i]);
                    if (i > 0) {
                        res.append(" ");
                    }
                }
                
                return res.toString();

        // String res = "";
        // String[] as = s.split(" ");
        // for (int i = as.length-1; i >=0; i--) {
        //     if(!"".equals(as[i])){
        //         res = res+as[i]+" ";
        //     }
        // }
        // return  res.substring(0, res.length()-1);
    }
}
// @lc code=end

