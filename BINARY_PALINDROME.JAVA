import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        binaryPalindrome();
    }

    public static void binaryPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Convert to binary string
        String s = Integer.toBinaryString(n);
        
        int l = 0, h = s.length() - 1;
        // Check if binary string is a palindrome
        while (l <= h) {
            if (s.charAt(l) != s.charAt(h)) {
                System.out.println("Binary palindrome? false");
                sc.close();
                return;
            }
            l++;
            h--;
        }
        System.out.println("Binary palindrome? true");
        sc.close();
    }
}
