Minimize the Heights II


// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k); // Maximum possible height difference

        int tempmax = arr[n - 1] - k; // Maximum element when we subtract k from whole array
        int tempmin = arr[0] + k; // Minimum element when we add k to whole array
        int max, min;

        /*
          We know minimum value when we add k to whole array---> tempmin. So we need to find minimum element when we subtract k from whole array so while searching for minimum element {arr[i]-k} we should search from--->[1,arr.length-1] and similarly for maximum element we should search from---> 
[0,arr.length-2] so that we can check the height difference between all pairs of adjacent elements because adjacent elements will have small height difference as the array is a sorted one.
        */

        for (int i = 0; i < n - 1; i++) {
            if (tempmax > (arr[i] + k)) {
                max = tempmax;
            } else {
                max = arr[i] + k;
            }
            // max = Math.max(tempmax, arr[i] + k); // can also be used

            if (tempmin < (arr[i + 1] - k)) {
                min = tempmin;
            } else {
                min = arr[i + 1] - k;
            }
            // min = Math.min(tempmin, arr[i + 1] - k); // can also be used

            if (min >= 0) {
                if (ans > (max - min)) {
                    ans = max - min;
                }
                // ans = Math.min(ans, max - min); // can also be used
            } else {
                min = arr[0] + k;
            }
        }

        return ans;
        
    }
}