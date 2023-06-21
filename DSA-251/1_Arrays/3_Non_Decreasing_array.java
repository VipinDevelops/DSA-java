class Solution {
    public boolean checkPossibility(int[] nums) {
      //https://www.youtube.com/watch?v=iL7oSNc3OXA&t=296s
        int pos = -1; //position need change

        for (int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                
                if(pos!=-1){ // check if we already found and error before 
                  return false;  
                }
                pos = i;// found an error
            }
        }

        // return true if postion is first OR
        // pos is second last element OR
        // prev <= next OR
        // post <= pos+2
    
        return pos==-1 || pos==0 || pos == nums.length-2 || nums[pos-1]<=nums[pos+1] || nums[pos]<=nums[pos+2];


    }
}
