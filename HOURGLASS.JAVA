import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]   // top row
                        + arr[i+1][j+1]                           // middle
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; // bottom row
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
