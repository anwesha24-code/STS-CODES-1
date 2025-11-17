import java.util.*;

public class Main {

    public static void leadersInArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int leader[] = new int[n];
        leader[n - 1] = arr[n - 1];
        System.out.println(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (leader[i + 1] < arr[i])
                System.out.println(arr[i]);
            leader[i] = Math.max(leader[i + 1], arr[i]);
        }
        sc.close();
    }

    public static void main(String[] args) {
        leadersInArray();
    }
}
