Minimum number of jumps

// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int arr[])
   {
       int n= arr.length;
       if (n <= 1) {
           return 0;
       }
       // Return -1 if not possible to jump
       if (arr[0] == 0) {
           return -1;
       }
       // initialization
       int maxReach = arr[0];
       int step = arr[0];
       int jump = 1;

       // Start traversing array
       for (int i = 1; i < n; i++) {
           // Check if we have reached // the end of the array
           if (i == n - 1) {
               return jump;

           }// updating maxReach
           maxReach = Math.max(maxReach, i + arr[i]);

           // we use a step to get to the current index
           step--;

           // If no further steps left
           if (step == 0) {
               // we must have used a jump
               jump++;

               // Check if the current
               // index/position or lesser index
               // is the maximum reach point
               // from the previous indexes

               if (i >= maxReach) {
                   return -1;
               }

               // re-initialize the steps to the amount
               // of steps to reach maxReach from position i.
               step = maxReach - i;
           }
       }

       return -1;
   }
}