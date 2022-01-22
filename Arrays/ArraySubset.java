Array Subset of another array 


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        List<Long> list1 = new ArrayList<Long>();
      for(long num:a1) {
        list1.add(num);
     }

       int count = 0;
       for(int i =0;i<m;i++)
       {
           if(!list1.contains(a2[i]))
           {
              return "No"; 
           }
       }
       return "Yes";
        
        
    }
}