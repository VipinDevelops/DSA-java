class Solution {
    public void rotate(int[] nums, int k) {

        //Here the rotation mean the last element will come the first place

//nums.length| k | Rotation
// ----------|---|---
// 5         | 0 | No rotation
// 5         | 1 | Rotate by 1 position
// 5         | 2 | Rotate by 2 positions
// 5         | 3 | Rotate by 3 positions
// 5         | 4 | Rotate by 4 positions
// 5         | 5 | Rotate by 5 positions
// 5         | 6 | Rotate by 1 position (since 6 % 5 = 1)
// 5         | 7 | Rotate by 2 positions (since 7 % 5 = 2)
        //Thats why we have 


        k = k % nums.length;// if any number is greater then the lenght of the array then we can use number%length of array to get the number within the length of our array 


        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);


//let's say we have the array [1, 2, 3, 4, 5] and we want to rotate it by 2 positions. The first step would normalize 2 to be 2 % 5 = 2, so we would proceed as follows:

// Reverse the first 2 elements of the array: [1, 2] becomes [2, 1].
// Reverse the last 3 elements of the array: [3, 4, 5] becomes [5, 4, 3].
// Reverse the entire array: [2, 1, 5, 4, 3] becomes [3, 4, 5, 1, 2].

        
    }

    //Reverse function
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    //Swap function 
    public void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}

