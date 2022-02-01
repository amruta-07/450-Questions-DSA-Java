Palindrome String

Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder input1=new StringBuilder();
        input1.append(S);
        input1.reverse();
        if(input1.toString().equals(S))
           return 1;
            else return 0;
        
        
        
    }
};