Count Inversions



Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
Your Task:
You don't need to read input or print anything. Your task is to complete the function inversionCount() which takes the array arr[] and the size of the array as inputs and returns the inversion count of the given array.

Expected Time Complexity: O(NLogN).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 5*105
1 ≤ arr[i] ≤ 1018



class Solution
{
   // arr[]: Input Array
   // N : Size of the Array arr[]
   //Function to count inversions in the array.
   static long inversionCount(long arr[], long N)
  {
      return sort(arr,0,(int)N-1);
  }
  
  static long sort(long[] arr,int l ,int r){
      if(l>=r){
          return 0;
      }
      long count = 0;
      int m = l +(r-l)/2;
      count += sort(arr,l,m);
       count+=sort(arr,m+1,r);
      count+=merge(arr,l,m,r);
      return count;
  }
  
   static long merge(long[] arr,int l,int m,int r){
     
     int n1 = m - l + 1;
      int n2 = r - m;

      
      long left[] = new long[n1];
      long right[] = new long[n2];

     
      for (int i = 0; i < n1; ++i)
          left[i] = arr[l + i];
      for (int j = 0; j < n2; ++j)
          right[j] = arr[m + 1 + j];
    
      
      int i = 0, j = 0, k = l;
      long count = 0;
      while (i < left.length && j < right.length) {
          if (left[i] <= right[j])
              arr[k++] = left[i++];
          else {
              arr[k++] = right[j++];
              count += n1-i;
          }
      }
      while (i < left.length)
          arr[k++] = left[i++];
      while (j < right.length)
          arr[k++] = right[j++];
      return count;
      
  }
}