/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        String res = "" ;

        int length =  s.length();
        int left = 0;


        while(length>0){
            if( length>=2*k ){
                for (int i = k-1; i >=0 ; i--) {
                    res = res + s.charAt(left+i) ;
                }
                for (int i = 0; i < k ; i++) {
                    res = res +s.charAt(left+k+i);
                    
                }
                length -= 2*k;
                left += 2* k;

            }
            if(length<2*k && length >=k){
                for (int i = k-1; i >=0 ; i--) {
                    res = res + s.charAt(left+i) ;
                }
                int resChar = length - k;
                for (int i = 0; i <resChar ; i++ ) {
                    res = res + s.charAt(left+k+i) ;
                }
                length = -1;
            }
            if(length < k ){

                for (int i = length-1; i >=0; i-- ) {
                    res = res + s.charAt(left+i);
                    
                }
                length = -1;
            }


        }
        return res;





        
    }
}
// @lc code=end

