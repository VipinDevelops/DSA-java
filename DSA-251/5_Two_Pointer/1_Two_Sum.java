class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create A Array to store the answer 
        int[] list = new int[2];

        // First Itration on each element
        for(int i = 0;i<nums.length;i++){
            // Secon itration on each element
            for(int j = 0;j<nums.length;j++){
                // check if we are getting the result and i != j
                if(nums[i]+nums[j]== target && i != j){
                    // store the answer 
                    list[0] = i;
                    list[1] = j;
                }
            }
        }
        // return answer;
        return list;
    }
}