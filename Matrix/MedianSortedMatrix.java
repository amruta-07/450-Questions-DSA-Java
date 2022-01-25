Median in a row-wise sorted Matrix


Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.

Example 1:

Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]

Output: 5

Explanation:
Sorting matrix elements gives us 
{1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 


class Solution {
   int median(int a[][], int r, int c) {
        
        ArrayList<Integer>l=new ArrayList<Integer>();
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                l.add(a[i][j]);
            }
        }
        
         int x=l.size()/2; // find the mid index of array.
         
       
          Collections.sort(l); // sort the element of matrix
         return  l.get(x);
   }
}