import java.util.ArrayList;
import java.io.*;

public class L7_Hamiltonian_Path_Cycle {

    public static class Edge {
        int u = 0;
        int v = 0;

        Edge(int src, int nbr) {
            this.u = src;
            this.v = nbr;
        }
    }

    public static ArrayList<Edge>[] graph;

    public static int findEdge(int u, int v) {
        for (int i = 0; i < graph[u].size(); i++) {
            Edge e = graph[u].get(i);
            if (e.v == v) {
                return i;
            }
        }
        return -1;
    }

    public static void hamiltonian_dfs(int src, int osrc, boolean[] vis, int NoOfEdges, String psf, int vtces) {
        if (NoOfEdges == vtces - 1) {
            System.out.print(psf + src);
            int idx = findEdge(src, osrc);
            if (idx != -1) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
            System.out.println();
            return;
        }

        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.v]) {
                hamiltonian_dfs(e.v, osrc, vis, NoOfEdges + 1, psf + src, vtces);
            }
        }
        vis[src] = false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        boolean[] vis = new boolean[vtces];
        hamiltonian_dfs(src, src, vis, 0, "", vtces);
    }
}
