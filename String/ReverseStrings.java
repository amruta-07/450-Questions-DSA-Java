Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

class Solution {
    public void reverseString(char[] s) {
        for(int i = 0 ; i<s.length/2;i++)
        {
            char c=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=c;
        }
    }
}