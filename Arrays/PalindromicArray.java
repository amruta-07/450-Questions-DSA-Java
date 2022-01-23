Palindromic Array

Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

 

Example:
Input:
2
5
111 222 333 444 555
3
121 131 20

Output:
1
0

Explanation:
For First test case.
n=5;
A[0] = 111    //which is a palindrome number.
A[1] = 222   //which is a palindrome number.
A[2] = 333   //which is a palindrome number.
A[3] = 444  //which is a palindrome number.
A[4] = 555  //which is a palindrome number.
As all numbers are palindrome so This will return 1.





class GfG
{
public static int palinArray(int[] a, int n)
          {
                 //add code here.
                 for(int i=0;i<n;i++)
                 {
                     int r=0;//result store
                     int t=0;
                     int s=a[i];//beacuse check array element                                           //    digit one by one
                    while(s>0)
                     {
                         t=s%10;  //  OR{r=r*10+s%10;}
                         r=r*10+t;
                         s=s/10;
                     }
                     if(r!=a[i])
                     {
                         return 0;
                     }
                 }
                 return 1;
          }
}