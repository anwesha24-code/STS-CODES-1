import java.util.*;

class Main {

    // Brute-force check using BFS
    static boolean isConnected(int a, int b, List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(a);
        visited[a] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == b) return true;

            for (int nxt : graph.get(node)) {
                if (!visited[nxt]) {
                    visited[nxt] = true;
                    q.add(nxt);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int q = sc.nextInt(); // number of operations

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < q; i++) {
            String type = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (type.equals("union")) {
                // brute-force union → just store the edge
                graph.get(a).add(b);
                graph.get(b).add(a);
            } 
            else if (type.equals("find")) {
                // brute-force find → run BFS
                if (isConnected(a, b, graph))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
