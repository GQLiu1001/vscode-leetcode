
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map map = new HashMap<>();

        int res = 0;
        for (int j = 0; j < nums1.length; j++) {
            for (int i = 0; i < nums2.length; i++) {
                if(map.containsKey(nums1[j]+nums2[i])){
                    int a = (int) map.get(nums1[j]+nums2[i]);
                    int b = a+1;
                    map.put(nums1[j]+nums2[i], b);
                }else{
                    map.put(nums1[j]+nums2[i], 1);
                }


            }
        }
        for (int j = 0; j < nums3.length; j++) {
            for (int i = 0; i < nums4.length; i++) {
                if(map.containsKey(-(nums3[j]+nums4[i]))){
                    res += (int) map.get(-(nums3[j]+nums4[i]));
                    
                }
            }
        }
        return res;
    }
}
// @lc code=end

