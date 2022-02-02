Longest Repeating Subsequence

Given a string str, find the length of the longest repeating subsequence such that it can be found twice in the given string. The two identified subsequences A and B can use the same ith character from string str if and only if that ith character has different indices in A and B.

Example 1:

Input:
str = "axxxy"
Output: 2
Explanation:
The given array with indexes looks like
a x x x y 
0 1 2 3 4

The longest subsequence is "xx". 
It appears twice as explained below.

subsequence A
x x
0 1  <-- index of subsequence A
------
1 2  <-- index of str 


subsequence B
x x
0 1  <-- index of subsequence B
------
2 3  <-- index of str 

We are able to use character 'x' 
(at index 2 in str) in both subsequences
as it appears on index 1 in subsequence A 
and index 0 in subsequence B.





class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int dp[][]=new int[str.length()+1][str.length()+1];
		
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
	
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					dp[i][j]=1+dp[i+1][j+1];
				}else {
					dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
        return dp[0][0];
    }
}