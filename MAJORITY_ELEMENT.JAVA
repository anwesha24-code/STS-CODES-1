import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = 0, count = 0;

        // Step 1: Find candidate
        for (int x : arr) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify (important)
        count = 0;
        for (int x : arr) {
            if (x == candidate)
                count++;
        }

        if (count > n / 2)
            System.out.println(candidate);
        else
            System.out.println("No majority element");
    }
}
