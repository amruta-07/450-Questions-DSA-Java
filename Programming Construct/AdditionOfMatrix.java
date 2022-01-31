AdditionOfMatrix

Problem Description
Given two matrices of dimension n x m, add the two matrices and print the resultant matrix.

Input format
There are 2n+1 lines of input.

First line contains two space separated integers n, m.

In the next 2n lines, each line contains m elements. The first n lines are for the first matrix, next n for the second matrix.

Output format
Print the resultant matrix.

Sample Input 1
2 2

1 2

3 4

1 1

1 1

Sample Output 1
2 3

4 5

Constraints
1 <= n,m <= 100

0 <= element of matrices <= 100000




import java.util.*;
class AdditionOfMatrix {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int gridOne[][] = new int[n][m];
        int gridTwo[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                gridOne[i][j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                gridTwo[i][j] = sc.nextInt();
        }

        int[][] result = additionOfMatrix(n, m, gridOne, gridTwo);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
    
    // TODO: Implement this method
    static int[][] additionOfMatrix(int n, int m, int[][] gridOne, int[][] gridTwo) {
    }
}