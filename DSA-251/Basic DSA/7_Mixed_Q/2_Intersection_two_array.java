class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Check Which array Is Smaller
        int[] smallArray = nums1.length > nums2.length ? nums2 : nums1;
        int[] bigArray = nums1.length <= nums2.length ? nums2 : nums1;
        
        // Make an Array to Store all the Similar elements 
        int[] similarArray = new int[smallArray.length];
        int index = 0;

        
        for(int i = 0; i < smallArray.length; i++) {
            // Check if Current Element exist int similarArray
            if(!isPresent(smallArray[i], index, similarArray)) {
                // Find the Elemetnt in big array 
                if(search(smallArray[i], bigArray))
                    //Storethe new element if we found it 
                    similarArray[index++] = smallArray[i];
            }
                
        }
        
        //Create a New array without Any empty blocks
        int[] resArray = new int[index];
        
        for(int i = 0; i < index; i++)
            resArray[i] = similarArray[i];
        
        return resArray;
    }
    // function to check if elemnt exist 
    static boolean isPresent(int num, int length, int[] arr) {
        for(int i = 0; i < length; i++){
            if(arr[i] == num)
                return true;
        }
            
        return false;
    }
    // Search element in array
    static boolean search(int target, int[] targetArray) {
        for(int i = 0; i < targetArray.length; i++)
            if(targetArray[i] == target)
                return true;
        return false;
    }
}