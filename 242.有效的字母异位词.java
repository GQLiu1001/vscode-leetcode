/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return  false;
        }
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
            hash[t.charAt(i) - 'a'] -= 1 ;
        }

        for (int i = 0; i < hash.length; i++) {
            if(hash[i]!=0){
                return  false;
            }
        }
        return  true;
    }
}
// @lc code=end

