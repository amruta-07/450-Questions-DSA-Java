Count Primes

Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.


public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    isPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}