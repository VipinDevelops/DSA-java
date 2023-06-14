class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0; // total sum of array

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int leftSum = 0;
        int rightSum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = total - nums[i] - leftSum; //calculating the right sum according to total and left sum 

            if (leftSum == rightSum) { //found the pivot 
                return i;
            }

            leftSum += nums[i]; // pivupdate the leftsum 
        }

        return -1;
    }
}
