Merge Intervals


class Solution {
    public int[][] merge(int[][] intervals) {
        int[] maxRightIndex = new int[10000+5];
        
        for(int i = 0; i<maxRightIndex.length; i++){
            maxRightIndex[i] = -1;
        }
        for(int i = 0; i<intervals.length; i++){
            int start = intervals[i][0], end = intervals[i][1];
            maxRightIndex[start] = Math.max(maxRightIndex[start], end);
        }
        ArrayList<int[]> newIntervals = new ArrayList<>();
        for(int i = 0; i < maxRightIndex.length; i++){
            int end =  maxRightIndex[i];
            if(end <0)continue;
            int j = i+1;
            while(j <= end){
                end = Math.max(end, maxRightIndex[j]);
                j++;
            }
            int[] interval = {i, end};
            i = end;
            newIntervals.add(interval);
        }
        
        int[][] res = new int[newIntervals.size()][2];
        for(int i = 0; i<res.length; i++){
            res[i]= newIntervals.get(i);
        }
        return res;
        
    }
}