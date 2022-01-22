Triplet Sum in Array 


Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       HashSet<Integer> set = new HashSet<Integer>();
    for(int i=0; i<n; i++){
        set.add(A[i]);
    }
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
          int sum = X - (A[i] + A[j]);
          if(set.contains(sum) && sum!= A[i] && sum!= A[j]){
              return true; }
       }
     }
       return false;
    
    }
}
