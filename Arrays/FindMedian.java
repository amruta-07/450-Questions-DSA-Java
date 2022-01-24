Find the median

Given an array arr[] of N integers, calculate the median
 

Example 1:

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array 
middle element is the median 




class Solution
{
    public int find_median(int[] v)
    {
        int ans=0;
        int len = v.length;
        Arrays.sort(v);
        if(len%2==0){
            ans = ((v[len/2] + v[(len/2)-1])/2);
        }
        else{
            ans = v[(len/2)];
        }
        return ans;
    }
}