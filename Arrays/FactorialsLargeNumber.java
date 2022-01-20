Factorials of large numbers

Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800



class Solution {
   static ArrayList<Integer> factorial(int N){
       //code here
       ArrayList<Integer>al=new ArrayList<>();
        java.math.BigInteger fact =  java.math.BigInteger.valueOf(1);
   for (int i = 1; i <= N; i++)
       fact = fact.multiply(java.math.BigInteger.valueOf(i));
       
   String in=String.valueOf(fact);
   
   for(int i=0;i<in.length();i++){
       int number=Integer.parseInt(String.valueOf(in.charAt(i)));
       al.add(number);
   }
   
   return al;
   }
}