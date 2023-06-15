class Solution {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" "); // spilt all spaces and store the string array as words 

        for (int j = words.length - 1; j >= 0; j--) {
            if (!words[j].equals("")) { //Now, our 'words' array has words and some empty spaces"" due to multiple spaces in String. So we ignore it 'if words[j] isn't equals to "" '.
                stringBuilder.append(words[j]).append(' '); // Only add those words[j] that is not equal to "".
            }
        }
        return stringBuilder.toString().trim(); //Delete that spaces using method 'trim()'.
    }
}