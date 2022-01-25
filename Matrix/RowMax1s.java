Row with max 1s

Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).



class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max=0;
        // code here
         int index = 0;


       for(int i = 0;i<n;i++){
           int sum = 0;
           for(int j = 0;j<m;j++){
               sum = sum +arr[i][j];
           }
           if(max<sum){
               max = sum;
               index = i;
           }
       }
     
