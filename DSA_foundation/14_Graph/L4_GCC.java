import java.io.*;
import java.util.*;

public class L4_GCC {
    static class Edge {
        int u;
        int v;
        int wt;

        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
    }

    public static ArrayList<Edge>[] graph;

    public static void dfs(int src, boolean[] vis, ArrayList<Integer> comp) {
        vis[src] = true;
        comp.add(src);
        for (Edge e : graph[src]) {
            if (!vis[e.v]) {
                dfs(e.v, vis, comp);
            }
        }
    }

    public static void gcc(int N, ArrayList<ArrayList<Integer>> comps) {
        boolean[] vis = new boolean[N];
        int components = 0;
        for (int i = 0; i < N; i++) {
            if (!vis[i]) {
                components++;
                ArrayList<Integer> comp = new ArrayList<>();
                dfs(i, vis, comp);
                comps.add(comp);
            }
        }
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
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        gcc(vtces, comps);
        System.out.println(comps);
    }
}
