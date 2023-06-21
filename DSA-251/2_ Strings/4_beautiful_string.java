public class Solution {
    public static int makeBeautiful(String str) {
        // variable for the length 
        int n = str.length();
        
        // Generate both case for the string which start from 0 or 1 
        String g1 = Generate(n, true);
        String g2 = Generate(n, false);
        
        //calculate the difference btw given string and the generated string 
        int diff1 = change(str, g1, n);
        int diff2 = change(str, g2, n);
            
        // compare both 
        // return the smaller difference
        if (diff2 < diff1) {
            return diff2;
        } else {
            return diff1;
        }
    }
    // Generating the strigns 
    public static String Generate(int n, boolean zero) {
        // Init the stringbuilder
        StringBuilder ans = new StringBuilder();
        
        // return empty string if the length is 0 ;
        if (n == 0) {
            return ans.toString();
        }

        // if boolean zero is true start with 0 else start with 1
        if (zero) {
            ans.append('0');
            n--;
        } else {
           ans.append('1');
        }
        
        // add next char according to the last char of the string 
        while (n != 0) {
            char temp = (ans.charAt(ans.length() - 1) == '0') ? '1' : '0';
            ans.append(temp);
            n--;   
        }
        
        // return the string
        return ans.toString();
    }
    
    // function to check the changes 
    public static int change(String a, String b, int n) {
        
        int ans = 0;
        // calculate the difference btw the both of the string inputed 
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                
                ans++;
            }
        }
        // return the difference 
        return ans;
    }
}
