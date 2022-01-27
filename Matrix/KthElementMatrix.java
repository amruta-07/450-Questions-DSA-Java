Kth element in matrix

Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

Example 1:
Input:
N = 4
mat[][] =     {{16, 28, 60, 64},
                   {22, 41, 63, 91},
                   {27, 50, 87, 93},
                   {36, 78, 87, 94 }}
K = 3
Output: 27
Explanation: 27 is the 3rd smallest element.





class Solution
{
public static int kthSmallest(int[][]mat,int n,int k)
{
       //code here.
       int[] add = new int[mat.length * mat.length];
       int p = 0;
       int ans = 0;
       
       for(int i=0;i<mat.length;i++)
       {
           for(int j=0;j<mat.length;j++)
           {
               add[p++] = mat[i][j];
           }
       }
       Arrays.sort(add);
       ans = k-1;
       return add[ans];
   }
}