import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int ctr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-')
                sb.append(s.charAt(i));
            else
                ctr++;
        }
        while (ctr > 0) {
            sb.insert(0, '-');
            ctr--;
        }
        System.out.println(sb.toString());
    }
}
