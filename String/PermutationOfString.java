Permutations of a given string

Given a string S. The task is to print all permutations of a given string in lexicographically sorted order.

 

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
 



class Solution {
    
    ArrayList<String> ans=new ArrayList<>();
    
    void solvePerm(String str,String asf){
        if(str.length()==0){
            ans.add(asf);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char chr=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            solvePerm(left+right,asf+chr);
        }
    }

    public List<String> find_permutation(String S) {
       solvePerm(S,"");
       Collections.sort(ans);
       return ans;
    }
}