import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        int l = 0, maxl = 0;

        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == '0')
                a--;
            while (a < 0) {
                if (s.charAt(l) == '0')
                    a++;
                l++;
            }
            maxl = Math.max(maxl, r - l + 1);
        }

        System.out.println(maxl);
    }
}
