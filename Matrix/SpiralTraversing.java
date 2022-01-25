spirally traversing a matrix

Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:




class Solution
{
   //Function to return a list of integers denoting spiral traversal of matrix.
   static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
   {
       // code here 
       ArrayList<Integer> list=new ArrayList<>();
       int count=0,i=0,j=0,k=0,l=r-1,E=0;
       while(count<r*c)
       {
           if(j<c-E)
           {
               list.add(matrix[i][j]);
               j++;
               count++;
           }
           else if(i<r-1-E)
           {
               i++;k=j-1;
               list.add(matrix[i][k]);
               count++;
           }
           else if(k>E)
           {
               k--;
               list.add(matrix[i][k]);
               count++;
           }
           else if(l>E+1)
           {
               l--;
               list.add(matrix[l][k]);
               count++;
           }
           else
           {
               E++;
               j=E;i=E;l=r-1-E;
           }
       }
       return list;
   }
}
