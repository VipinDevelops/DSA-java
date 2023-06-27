import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Create a new array to store unique elements
        int[] arr = new int[nums.length];

        // Initialize the first element of arr with the first element of nums
        arr[0] = nums[0];
        int diff = 0;

        // Iterate through the nums array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element in arr is greater than or equal to the current element in nums,
            // we need to make them unique
            if (arr[i - 1] >= nums[i]) {
                // Calculate the difference needed to make the elements unique and update the diff variable
                diff += arr[i - 1] - nums[i] + 1;
                // Set the current element in arr to be one more than the previous element
                arr[i] = arr[i - 1] + 1;
            } else {
                // If the current element in arr is less than the current element in nums,
                // it is already unique, so we can simply assign it to arr
                arr[i] = nums[i];
            }
        }

        // Return the total difference
        return diff;
    }
}
