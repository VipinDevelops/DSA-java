import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String input) {

		// It first checks if the input string is null or empty. If it is, it returns an empty string.
	     if (input == null || input.isEmpty()) {
            return "";
        }

		//The encodedString variable is created as a StringBuilder object. It will be used to build the encoded string.
        StringBuilder encodedString = new StringBuilder();

		//The count variable is initialized to 1. It represents the number of consecutive occurrences of a character.
        int count = 1;


		// The for loop iterates over the characters of the input string starting from index 1.
        for (int i = 1; i < input.length(); i++) {
			// compares the current character with the previous character (input.charAt(i - 1)). 
			//If they are the same, it means we have found another occurrence of the same character,
			//  so we increment the count variable.

            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
				// If the current character is different from the previous one,
				// it means we have reached the end of a sequence of consecutive characters.
				// In this case,
				// we append the previous character (input.charAt(i - 1)) and its count (count)and reset the count to 1.
                encodedString.append(input.charAt(i - 1));
                encodedString.append(count);
                count = 1;
            }
        }

	    //After the loop, we have to append the last character of the input string and its count 
		// because the loop ends before processing it.

        encodedString.append(input.charAt(input.length() - 1));
        encodedString.append(count);

        return encodedString.toString();
	}

}











