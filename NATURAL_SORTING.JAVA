import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lst = new ArrayList<>();
        while (sc.hasNextLine()) {
            lst.add(sc.nextLine());
        }
        Collections.sort(lst, (a, b) -> {
            int n1 = Integer.parseInt(a.replaceAll("\\D", ""));
            int n2 = Integer.parseInt(b.replaceAll("\\D", ""));
            return n1 - n2;
        });
        for (String item : lst) {
            System.out.println(item);
        }
    }
}
