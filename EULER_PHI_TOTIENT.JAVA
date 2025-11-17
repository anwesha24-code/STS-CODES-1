import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        totient();
    }

    // Function to compute gcd of two numbers
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to compute Euler's Totient of n
    public static void totient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (gcd(i, n) == 1)
                count++;
        }

        System.out.println("Euler's Totient φ(" + n + ") = " + count);
        sc.close();
    }
}
