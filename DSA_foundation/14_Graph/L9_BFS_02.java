import java.util.LinkedList;
import java.util.*;

public class L9_BFS_02 {

    public static class Edge {
        int v = 0;
        int w = 0;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }

    public static void BFS_WithoutCycle(ArrayList<Edge>[] graph, int src, boolean[] vis) {
        int level = 0;

        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);

        vis[src] = true;
        while (que.size() != 0) {
            int size = que.size();
            System.out.print(level + " : ");

            while (size-- > 0) {
                int rvtx = que.removeFirst();

                System.out.print(rvtx + " ");
                for (Edge e : graph[rvtx]) {
                    if (!vis[e.v]) {
                        que.addLast(e.v);
                        vis[e.v] = true;
                    }
                }
            }
            System.out.println();
            level++;
        }
    }

    public static void constructGraph() {
        int N = 9;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 0, 10);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 5, 6, 3);
        addEdge(graph, 6, 4, 8);
        addEdge(graph, 2, 7, 10);
        addEdge(graph, 2, 8, 10);
        addEdge(graph, 7, 8, 10);

        boolean[] vis = new boolean[N];
        BFS_WithoutCycle(graph, 0, vis);
    }

    public static void main(String[] args) {
        constructGraph();
    }
}