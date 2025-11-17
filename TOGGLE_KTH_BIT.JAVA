import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        toggleBit();
    }

    public static void toggleBit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter bit position to toggle (0-based): ");
        int k = sc.nextInt();

        // Toggle the k-th bit using XOR
        num = num ^ (1 << k);

        System.out.println("Number after toggling bit " + k + ": " + num);
        sc.close();
    }
}
