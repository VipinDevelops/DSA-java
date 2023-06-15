class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int check = 0;

        for(char ch:s.toCharArray()){ // loop through the char array
            if(ch == '('){  
                check++; // check +1 if found an open bracket
            }else if(ch == ')'){ // if found a close bracket 
                if(check > 0){  // and check greater then 0 
                    check--; // check-- cause we found a pair 
                }
                else{
                    ans++; // else ans++ cause we got a open bracket without close 
                }
            }
        }
        return ans + check; // add both and return as answer 

    }
}
