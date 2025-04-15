
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0;
        int count = 1;
        int maxCount = 1; // 跟踪最大序列长度
        for (int j = 1; j < nums.length;) {
            if (nums[i] == nums[j]) {
                i++;
                j++;
                continue;
            }
            if (nums[i] == nums[j] - 1) {
                i++;
                j++;
                count++;
                maxCount = Math.max(maxCount, count); // 更新最大值
                continue;
            }
            if (nums[i] != nums[j] - 1) {
                set.add(count); // 存入当前序列长度
                i++;
                j++;
                count = 1;
            }
        }
        set.add(count); // 存入最后一个序列长度
        // 从 set 中取最大值
        int result = maxCount;
        for (Integer len : set) {
            result = Math.max(result, len);
        }
        return result;
    }
}
// @lc code=end

