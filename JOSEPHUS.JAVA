import java.util.*;

public class Main {

    public static int josephus(int n, int k) {
        if (n == 1) return 1;                  // base case
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // number of people
        int k = sc.nextInt();    // step count
        System.out.println(josephus(n, k));
        sc.close();
    }
}
