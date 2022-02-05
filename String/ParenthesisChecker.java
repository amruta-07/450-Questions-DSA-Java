Parenthesis Checker

Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.




class Solution
{
   //Function to check if brackets are balanced or not.
   static boolean ispar(String x)
   {
       // add your code here
       Stack<Character> s=new Stack<>();
       s.push(x.charAt(0));
       for(int i=1;i<x.length();i++)
       {
           if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[')
           s.push(x.charAt(i));
           else 
           {
               if(s.isEmpty()) return false;
               
               switch(x.charAt(i))
               {
                   case ')':
                       if(s.peek()!='(')
                       return false;
                       else s.pop();
                       break;
                       
                   case '}':
                       if(s.peek()!='{')
                       return false;
                       else s.pop();
                       break;
                       
                   case ']':
                       if(s.peek()!='[')
                       return false;
                       else s.pop();
                       break;
               }
           }
       }
       return s.isEmpty();
   }
}