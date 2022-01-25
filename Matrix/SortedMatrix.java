Sorted matrix

Given an NxN matrix Mat. Sort all elements of the matrix.

Example 1:

Input:
N=4
Mat=[[10,20,30,40],
[15,25,35,45] 
[27,29,37,48] 
[32,33,39,50]]
Output:
10 15 20 25 
27 29 30 32
33 35 37 39
40 45 48 50
Explanation:
Sorting the matrix gives this result.




class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
       int a[]=new int[N*N];
       int k=0;
       for(int i=0;i<N;i++)
       {
           for(int j=0;j<N;j++)
           {
               a[k]=Mat[i][j];
               k++;
           }
       }
       Arrays.sort(a);
       int x=0;
       for(int i=0;i<N;i++)
       {
           for(int j=0;j<N;j++)
           {
               Mat[i][j]=a[x];
               x++;
           }
       }
       return Mat;
   }
}