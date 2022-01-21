Longest Consecutive subsequence

Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.



class Solution
{   
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   TreeSet<Integer> set = new TreeSet<>();
	   for(int x:arr) set.add(x);
	   
	   int count = 1;
	   int max = -1;

	   for(Integer x:set)
	   {
	       if(set.contains(x+1)){
	           count++;
	       }
	       else{
	           max = Math.max(count, max);
	           count=1;
	       }
	   }
	   return max;
	}
}