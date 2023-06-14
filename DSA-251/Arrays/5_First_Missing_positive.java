class Solution {
    public int firstMissingPositive(int[] nums) {
        // Array question 5
        // cycle sort // we can sort in n comparison only,
        // we use the cycle sort when the numer are given 1 to n, use cycle sort 
        // question like you given 1 to n and find the  missing number or find smallest missing number , find the dulicate number  

     
       int i = 0;
       while(i<nums.length){ 
           int correct = nums[i]-1; // the correct index
        // nums[i]>0 // only swap if number is greater than 0 // mean ignore negative number's
        // nums[i]<=nums.length // mean only swap if the element inside is less then length // dont sswap last element because if all the elements are already sorted the last element is at correct position 
        // nums[i]!= nums[correct] // element not on its correct index
           if(nums[i]>0 &&nums[i]<=nums.length && nums[i]!=nums[correct]){ //
               swap(nums,i,correct); // put on correct index
           }else{
               i++;
           }
       } 

        //Start searching form the start the first index we find where the element it not on its correct index that is the answer
       for(int index = 0;index<nums.length;index++){
           if(nums[index]!=index+1){
               return index+1;
           }
       }
        // if we haven't find any number then the only number missing is the last element 
       return nums.length+1;


    }
    void swap (int[]arr,int first,int second ){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
