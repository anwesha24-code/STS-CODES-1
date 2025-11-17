import java.util.*;

public class Main {
    static class Edge {
        int v, wt;
        Edge(int v, int wt) { this.v = v; this.wt = wt; }
    }

    public static int prim(int v, List<List<Edge>> g) {
        boolean[] vis = new boolean[v];
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.wt - b.wt);

        pq.add(new Edge(0, 0));
        int sum = 0;

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                sum += curr.wt;
                for (Edge neigh : g.get(curr.v)) {
                    if (!vis[neigh.v])
                        pq.add(new Edge(neigh.v, neigh.wt));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        List<List<Edge>> g = new ArrayList<>();
        for (int i = 0; i < n; i++)
            g.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.get(u).add(new Edge(v, w));
            g.get(v).add(new Edge(u, w));
        }

        System.out.println(prim(n, g));
    }
}
