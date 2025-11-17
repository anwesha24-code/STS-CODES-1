import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        strobogrammatic();
    }

    public static void strobogrammatic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String s = String.valueOf(n);
        int l = 0, h = s.length() - 1;

        while (l <= h) {
            char left = s.charAt(l);
            char right = s.charAt(h);

            if (!((left == '0' && right == '0') ||
                  (left == '1' && right == '1') ||
                  (left == '6' && right == '9') ||
                  (left == '8' && right == '8') ||
                  (left == '9' && right == '6'))) {
                System.out.println("Strobogrammatic? false");
                sc.close();
                return;
            }
            l++;
            h--;
        }

        System.out.println("Strobogrammatic? true");
        sc.close();
    }
}
