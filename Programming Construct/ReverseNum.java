Problem Description
Given a number, return the reverse of that number.

Input format
One line of input containing an integer N, the number to be reversed.

Output format
Return the reversed number. Note that the number must start with (1-9) digits only unless it is a single digit number.

Sample Input 1
15

Sample Output 1
51

Constraints
0 <= N <= 1000000

Explanation
Reverse of 15 is 51.


import java.io.*;
import java.util.*;
 class ReverseNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0,rem;

        while(n!=0)
        {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
            
        }
                 System.out.println(rev);

       
    }
}