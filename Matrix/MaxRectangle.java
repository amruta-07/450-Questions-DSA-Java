Max rectangle

Given a binary matrix M of size n X m. Find the maximum area of a rectangle formed only of 1s in the given matrix.

Example 1:

Input:
n = 4, m = 4
M[][] = {{0 1 1 0},
         {1 1 1 1},
         {1 1 1 1},
         {1 1 0 0}}
Output: 8
Explanation: For the above test case the
matrix will look like
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
the max size rectangle is 
1 1 1 1
1 1 1 1
and area is 4 *2 = 8.

class Solution {
    public int maxArea(int mat[][], int n, int m) {
        int ans=0;
        int arr[]=new int [m];
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                if(mat[r][c]==0)
                    arr[c]=0;
                else
                    arr[c]+=1;
            }
            ans=Math.max(ans,getMaxArea(arr,arr.length));
        }
        return(ans);
    }//maxArea
    public  int getMaxArea(int arr[], int n) 
    {
        Stack<Integer>myst=new Stack<Integer>();
        int len=n;
        int l[]=new int [len];
        int r[]=new int [len];
        for(int i=0;i<len;i++){
            while(myst.size()>0 && arr[myst.peek()]>=arr[i])
                myst.pop();
                
            if(myst.size()==0)
                l[i]=-1;
                
            else
                l[i]=myst.peek();
                
            myst.push(i);
        }
        
        myst=new Stack<Integer>();
        
        for(int i=len-1;i>=0;i--){
            while(myst.size()>0 && arr[myst.peek()]>=arr[i])
                myst.pop();
            if(myst.size()==0)
                r[i]=len;
                
            else
                r[i]=myst.peek();
                
            myst.push(i);
        }
        int ans=0;
        for(int i=0;i<l.length;i++){
            int area=arr[i]*(r[i]-l[i]-1);
            ans=Math.max(ans,area);
        }
        return(ans);
    }//getMaxArea
}//Solution