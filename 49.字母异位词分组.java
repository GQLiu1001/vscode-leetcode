
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap =  new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String str_s = String.valueOf(chars);
            if (hashMap.containsKey(str_s)){
                hashMap.get(str_s).add(str);
            } else {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(str);
                hashMap.put(str_s, strings);
            }
        }
        List<List<String>> resultList = new ArrayList<>(hashMap.values());
        return resultList;
    }
}

// @lc code=end

