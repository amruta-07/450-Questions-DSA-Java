Word wrap

Given an array nums[] of size n, where nums[i] denotes the number of characters in one word. Let K be the limit on the number of characters that can be put in one line (line width). Put line breaks in the given sequence such that the lines are printed neatly.
Assume that the length of each word is smaller than the line width. When line breaks are inserted there is a possibility that extra spaces are present in each line. The extra spaces include spaces put at the end of every line except the last one. 

You have to minimize the following total cost where total cost = Sum of cost of all lines, where cost of line is = (Number of extra spaces in the line)2.

Example 1:

Input: nums = {3,2,2,5}, k = 6
Output: 10
Explanation: Given a line can have 6
characters,
Line number 1: From word no. 1 to 1
Line number 2: From word no. 2 to 3
Line number 3: From word no. 4 to 4
So total cost = (6-3)2 + (6-2-2-1)2 = 32+12 = 10.
As in the first line word length = 3 thus
extra spaces = 6 - 3 = 3 and in the second line
there are two word of length 2 and there already
1 space between two word thus extra spaces
= 6 - 2 -2 -1 = 1. As mentioned in the problem
description there will be no extra spaces in
the last line. Placing first and second word
in first line and third word on second line
would take a cost of 02 + 42 = 16 (zero spaces
on first line and 6-2 = 4 spaces on second),
which isn't the minimum possible cost.




class Solution
{
    final static int inf=Integer.MAX_VALUE;
    
    public int solveWordWrap (int[] nums, int m)
    {
        
        int n=nums.length;
		int space[][]=new int[n+1][n+1];
		int ls[][]=new int[n+1][n+1];
		int c[]=new int[n+1];
	
		
		for(int i=1;i<=n;i++) {
			space[i][i]=m-nums[i-1];
		
			for(int j=i+1;j<=n;j++) {
				space[i][j]=space[i][j-1]-nums[j-1]-1;
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(space[i][j]<0) {
					ls[i][j]=inf;
				}else if(j==n && space[i][j]>=0) ls[i][j]=0;
				else {
					ls[i][j]=space[i][j]*space[i][j];
				}
			}
		}
		

		c[0] = 0;
        for (int j = 1; j <= n; j++)
        {
            c[j] = inf;
            for (int i = 1; i <= j; i++)
            {        
                if (c[i-1] != inf && ls[i][j] != inf 
                &&(c[i-1] + ls[i][j] < c[j])) {        
                             	
                    c[j] = c[i-1] + ls[i][j];                  
                }
            }
        }
        return c[n];
    }
}