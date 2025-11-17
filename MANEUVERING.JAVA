import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(rec(n, m));
    }

    static int rec(int x, int y) {
        if (x == 0 || y == 0)
            return 1;
        return rec(x, y - 1) + rec(x - 1, y);
    }
}
