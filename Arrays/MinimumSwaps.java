Minimum swaps and k together

Given an array arr of n positive integers and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

Example 1:

Input : 
arr[ ] = {2, 1, 5, 6, 3} 
K = 3
Output : 
1
Explanation:
To bring elements 2, 1, 3 together,
swap index 2 with 4 (0-based indexing),
i.e. element arr[2] = 5 with arr[4] = 3
such that final array will be- 
arr[] = {2, 1, 3, 6, 5}





class Complete{
   public static int minSwap (int arr[], int n, int k) {
       int count=0,nonfav=0,result=Integer.MAX_VALUE;
       for(int o:arr){
           if(o<=k) count++;
       }
       int i=0,j=count-1;
       while(j<n){
           for(int l=i;l<=j;l++){
               if(arr[l]>k) nonfav++;
           }
           result=Math.min(result,nonfav);
           nonfav=0;
           j++;i++;
       }
       return result;
   }
}