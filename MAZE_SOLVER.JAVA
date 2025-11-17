import java.util.*;

public class Main {

    public static boolean solve(int[][] maze, int i, int j, int n, int m, int[][] soln) {
        if (i == n - 1 && j == m - 1 && maze[i][j] == 1) {
            soln[i][j] = 1;
            return true;
        }

        if (i >= 0 && i < n && j >= 0 && j < m && maze[i][j] == 1) {
            soln[i][j] = 1;

            // Move down or right
            if (solve(maze, i + 1, j, n, m, soln) || solve(maze, i, j + 1, n, m, soln))
                return true;

            // Backtrack
            soln[i][j] = 0;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int maze[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int soln[][] = new int[n][m];
        if (solve(maze, 0, 0, n, m, soln)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(soln[i][j]);
                }
                System.out.println();
            }
        }
    }
}
