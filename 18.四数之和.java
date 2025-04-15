
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k=0;k<nums.length;k++){
            //第一级剪枝
            if(nums[k]>0&&nums[k]>target){break;}
            //第一级去重
            if(k>0&&nums[k]==nums[k-1]){continue;}
            for (int i = k+1; i < nums.length; i++) {
                //第二级剪枝
                if (nums[k] + nums[i] > target && nums[k] + nums[i] > 0) break;
                //第二级去重
                if(i>k+1&&nums[i]==nums[i-1]){continue;}
                int left = i + 1;
                int right = nums.length -1 ;
                while(left<right){
                    int sum = nums[i] + nums[k] + nums[left] + nums[right];
                    if(sum> target){
                        right--;
                    }else if(sum< target){
                        left++;
                    }else{
                        res.add(Arrays.asList(nums[k],nums[i], nums[left], nums[right]));
                        //第三级去重
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;

                    }


                }

            }


        }
        
        return res;
        }
}
// @lc code=end

