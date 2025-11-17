import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        crt();
    }

    // Brute-force Chinese Remainder Theorem
    public static void crt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of congruences: ");
        int n = sc.nextInt();

        int[] a = new int[n];  // remainders
        int[] m = new int[n];  // moduli

        System.out.println("Enter remainders:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter moduli:");
        for (int i = 0; i < n; i++)
            m[i] = sc.nextInt();

        int x = 1;

        // Check each number until all congruences are satisfied
        while (true) {
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (x % m[i] != a[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("Solution: " + x);
                break;
            }
            x++;
        }
        sc.close();
    }
}
