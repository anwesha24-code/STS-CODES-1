import java.util.*;

public class Main {
    static int n;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], -1);

        board[0][0] = 0;
        if (solve(0, 0, 1)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(board[i][j] + " ");
                System.out.println();
            }
        } else
            System.out.println(-1);
    }

    static boolean solve(int x, int y, int move) {
        if (move == n * n)
            return true;

        int[][] dir = { {2,1},{1,2},{-1,2},{1,-2},{2,-1},{-2,1},{-1,-2},{-2,-1} };
        for (int[] d : dir) {
            int newx = x + d[0];
            int newy = y + d[1];
            if (newx >= 0 && newx < n && newy >= 0 && newy < n && board[newx][newy] == -1) {
                board[newx][newy] = move;
                if (solve(newx, newy, move + 1))
                    return true;
                board[newx][newy] = -1;
            }
        }
        return false;
    }
}
