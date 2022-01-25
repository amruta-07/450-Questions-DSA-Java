Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true




class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0;
        int column = matrix[0].length -1;
        //Approach: Start from the last column of a row
        // If target is less than the last element of the row
        // It means, row contains the target, so search it by doing column--;
        
        //If target is greater than the last element of the row
        // It means the row doesn't contains the target
        // So, increase the row by doing row++
        
        
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target) return true;
            
            
            //If target is smaller than the last element of row
            if(target < matrix[row][column]){
                column--;
            }else{
                row++; // If target is greater than the last element of row;
            }
        }
        return false;
        
    }

        
    
}