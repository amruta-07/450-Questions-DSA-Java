Problem Description
Given a matrix of dimensions n x n, find the sum of elements along the principal diagonal of the matrix.

Principal diagonal is the diagonal that starts at top left(0,0),(1,1) and goes to the bottom right (n-1,n-1).

Input format
There are n+1 lines of input.

First line contains integer n.

In the next n lines each line contains n elements.

Output format
An integer representing the sum of diagonal elements.

Sample Input 1
4

1 2 3 4

1 2 4 5

2 3 3 4

1 1 2 3

Sample Output 1
9

Constraints
1 <= n <= 100

0 <= element of matrix <= 10^5



import java.util.*;

class DiagonalSum {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
    }

    // TODO: Implement this method
    static int diagonalSum(int n, int[][] a) {
    }
}