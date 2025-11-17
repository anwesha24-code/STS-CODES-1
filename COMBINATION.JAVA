import java.util.*;

public class Main {

    public static void combine(int[] arr, int[] data, int st, int idx, int r) {

        if (idx == r) {
            System.out.print("{ ");
            for (int x : data) System.out.print(x + " ");
            System.out.println("}");
            return;
        }

        for (int i = st; i < arr.length; i++) {
            data[idx] = arr[i];
            combine(arr, data, i + 1, idx + 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            // Number of elements
        int r = sc.nextInt();            // Size of combination

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] data = new int[r];
        combine(arr, data, 0, 0, r);
        sc.close();
    }
}
