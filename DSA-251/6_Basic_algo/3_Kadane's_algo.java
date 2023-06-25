
class Solution {
    public int maxSubArray(int[] nums) {
     int sum = Integer.MIN_VALUE;
    int ans = Integer.MIN_VALUE;
        
        for(int data : nums){
            // if sum is greater then 0 then add data in sum else the data is new sum 
            sum = sum>0 ? sum+=data:data;
            // compare the sum value to get the max in the end 
            ans = Math.max(ans, sum);
        }
        return ans;
        
    }
}



























