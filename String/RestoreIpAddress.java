Restore IP Addresses

A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.

 

Example 1:

Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]


class Solution {
public List<String> restoreIpAddresses(String s) {
    List<String> ls= new ArrayList<>();
    List<String> ans= new ArrayList<>();
    util(s,0,ls,ans);
    return ans;
    
    

}
public static void util(String s , int k , List<String> ls,List<String> ans ){
    if(s==null || s.length()==0){
        if(k==4){
            String temp="";
            for(int i=0;i<ls.size();i++){
                if(i==ls.size()-1){
                    temp+=ls.get(i);
                }else{
                  temp+=ls.get(i)+".";  
                }
            }
            ans.add(temp);
            return;
        }
    }
    
    
    for(int i=1;i<=s.length();i++){
        String rem= s.substring(0,i);
        if(rem.length()>1 && rem.charAt(0)=='0'){
            continue;
        }
        if(Long.parseLong(rem)<=255){
            ls.add(rem);
            util(s.substring(i,s.length()),k+1,ls,ans);
            ls.remove(ls.size()-1);
        }
    }
}
}