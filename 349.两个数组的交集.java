
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Map map = new HashMap<>();
       Map resMap = new HashMap<>();
       List<Integer> resultList = new ArrayList<>();

       for (int i = 0; i < nums1.length; i++) {
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i], i);
            }
       }
       for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])){
                if(!resMap.containsKey(nums2[i])){
                    resMap.put(nums2[i], i);
                    resultList.add(nums2[i]);
                }
                
            }
       }
       int[] res = new int[resultList.size()];
       for (int i = 0; i < res.length; i++) {
            res[i] = resultList.get(i);

        
       }
      
       return res;
       
    }
       
    
}
// @lc code=end

