import java.util.*;

public class Main {

    public static void solve(char[] a, boolean[] u, String s) {
        if (a.length == s.length()) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (u[i] || (i > 0 && a[i] == a[i - 1] && !u[i - 1])) continue;
            u[i] = true;
            solve(a, u, s + a[i]);
            u[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        boolean[] u = new boolean[a.length];
        solve(a, u, "");
        sc.close();
    }
}
