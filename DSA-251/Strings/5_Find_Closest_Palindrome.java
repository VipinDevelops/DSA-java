class Solution {
    public String nearestPalindromic(String n) {
        // Change number to a long
        Long number = Long.parseLong(n);
        
        // I) Edge cases 
        // 1. If the number is less than or equal to 10, 100, 1000, 1000... subtract 1
        if (number <= 10 || (number % 10 == 0 && n.charAt(0) == '1')) {
            return Long.toString(number - 1);
        }

        // 2. If the number is 11, 101, 1001, 10001... subtract 2
        if (number == 11 || (number % 10 == 1 && n.charAt(0) == '1' )) {
            return Long.toString(number - 2);
        }

        // 3. If the number is 9, 99, 999, 9999... add 2
        if (isAllNine(n)) {
            return Long.toString(number + 2);
        }

        // II) Construct closest palindrome and calculate absolute difference with n
        boolean isEvenDigits = n.length() % 2 == 0;

        // Get the palindrome root based on the number of digits
        int palindromeRoot = getPalindromeRoot(n, isEvenDigits);

        // Construct the palindrome numbers
        long samePalindromeRoot = getPalindrome(palindromeRoot, isEvenDigits);
        long diffSame = Math.abs(samePalindromeRoot - number);

        long biggerPalindromeRoot = getPalindrome(palindromeRoot + 1, isEvenDigits);
        long diffBigger = Math.abs(biggerPalindromeRoot - number);

        long smallerPalindromeRoot = getPalindrome(palindromeRoot - 1, isEvenDigits);
        long diffSmaller = Math.abs(smallerPalindromeRoot - number);

        // III) Find closest
        // Compare absolute differences and select the closest palindrome
        long closest = diffBigger < diffSmaller ? biggerPalindromeRoot : smallerPalindromeRoot;
        long minDiff = Math.min(diffSmaller, diffBigger);

        // If the number is not a palindrome, check if the difference with the palindrome
        // with the same root is smaller than the current minimum difference.
        // If so, update the closest palindrome. If there is a tie, select the smaller palindrome.
        if (diffSame != 0) {
            if (diffSame < minDiff) {
                closest = samePalindromeRoot;
            } else if (diffSame == minDiff) {
                closest = Math.min(samePalindromeRoot, closest);
            }
        }

        return Long.toString(closest);
    }

    private long getPalindrome(int palindromeRoot, boolean isEvenDigits) {
        long palindrome = palindromeRoot;
        
        // If the number of digits is odd, remove the last digit from the palindrome root
        if (!isEvenDigits) {
            palindromeRoot /= 10;
        }

        // Construct the palindrome by appending the palindrome root in reverse order
        while (palindromeRoot > 0) {
            palindrome = palindrome * 10 + palindromeRoot % 10;
            palindromeRoot /= 10;
        }
        
        return palindrome;
    }

    private int getPalindromeRoot(String str, boolean isEvenDigits) {
        int strLen = str.length();
        
        // Get the palindrome root based on the number of digits
        // The root is obtained by taking the first half (or first half + middle digit for odd-length numbers)
        String palindromeRoot = isEvenDigits ? str.substring(0, strLen / 2) : str.substring(0, strLen / 2 + 1);

        return Integer.parseInt(palindromeRoot);
    }

    // Check if all digits are 9
    private boolean isAllNine(String n) {
        for (char c: n.toCharArray()) {
            if (c != '9') {
                return false;
            }
        }

        return true;
    }
}
