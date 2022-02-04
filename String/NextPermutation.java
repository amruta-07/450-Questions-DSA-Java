Next Permutation

Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.

Example 1:

Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the 
given array is {1, 2, 4, 3, 5, 6}.


class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        
     List<Integer> list = new ArrayList<>(arr.length);        
     int preLarge=N-1;     
	        for(int i=N-2;i>=0;i--){
	            if(arr[preLarge]<=arr[i]){
	                preLarge=i;
	            }else   break;
	        }	        
	        
	       if(preLarge!=0) {
	        	
	        int nextMax=preLarge;
	        for(int i=preLarge+1;i<N;i++){	        	        	
	        	if(arr[i]>arr[preLarge-1] && arr[i]<arr[nextMax]) nextMax=i; 
	        }
	             int temp=arr[preLarge-1];
	             arr[preLarge-1]=arr[nextMax];
	             arr[nextMax]=temp;
	             Arrays.sort(arr,preLarge, N);
	     
	        }else Arrays.sort(arr);	        
 
        for (int a: arr) list.add(a);
        
	     return list;
    }
}