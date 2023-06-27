import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] nums, int n) {
		// Moore’s Voting Algorithm
 		int candidate = 0;  // Potential majority element candidate
        int count = 0;     // Count of occurrences of the candidate
        
        // Finding the potential majority element candidate
        for (int num : nums) {
			// Check if count is 0 and update the with New candidate 
            if (count == 0) {
                candidate = num;
                count = 1;
			// Found another element match the candidate increase the count 
            } else if (candidate == num) {
                count++;
			// Else decrease the count
            } else {
                count--;
            }
        }
        
        // Verifying if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        if (count > nums.length / 2) {
            return candidate;
        }
        
        return -1;  // No majority element found
	}
}
