import java.io.*;
import java.util.*;

// Multisolver - Smallest Path, Longest Path , Ceil Value, Floor value
public class L3_MultiSolver {
    static class Edge {
        int src;
        int v;
        int w;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.v = nbr;
            this.w = wt;
        }
    }

    public static ArrayList<Edge>[] graph;

    public static class pair {
        int smallestWeight = (int) 1e9;
        String smallestPath = "";
        int largestWeight = -(int) 1e9;
        String largestPath = "";

        int ceil = (int) 1e9;
        String ceilPath = "";
        int floor = -(int) 1e9;
        String floorPath = "";
    }

    public static class pqPair {
        int wsf = 0;
        String psf = "";

        pqPair(int wsf, String psf) {
            this.wsf = wsf;
            this.psf = psf;
        }
    }

    public static PriorityQueue<pqPair> pq = new PriorityQueue<>((a, b) -> {
        return a.wsf - b.wsf;
    });

    public static void allSolution(int src, int dest, boolean[] vis, pair p, String psf, int wsf, int givenWeight,
            int k) {

        if (src == dest) {
            if (wsf < p.smallestWeight) {
                p.smallestWeight = wsf;
                p.smallestPath = psf + dest;
            }

            if (wsf > p.largestWeight) {
                p.largestWeight = wsf;
                p.largestPath = psf + dest;
            }

            if (wsf < givenWeight) {
                if (wsf > p.floor) {
                    p.floor = wsf;
                    p.floorPath = psf + dest;
                }
                // p.floor = Math.max(p.floor, wsf);
            }

            if (wsf > givenWeight) {
                if (wsf < p.ceil) {
                    p.ceil = wsf;
                    p.ceilPath = psf + dest;
                }
                // p.ceil = Math.min(p.ceil, wsf);
            }

            pq.add(new pqPair(wsf, psf + dest));
            if (pq.size() > k) {
                pq.remove();
            }

            return;
        }

        vis[src] = true;

        for (Edge e : graph[src]) {
            if (!vis[e.v]) {
                allSolution(e.v, dest, vis, p, psf + src, wsf + e.w, givenWeight, k);
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
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        int criteria = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        boolean[] vis = new boolean[vtces];
        pair p = new pair();
        allSolution(src, dest, vis, p, "", 0, criteria, k);

        System.out.println("Smallest Path = " + p.smallestPath + "@" + p.smallestWeight);
        System.out.println("Largest Path = " + p.largestPath + "@" + p.largestWeight);
        System.out.println("Just Larger Path than " + criteria + " = " + p.ceilPath + "@" + p.ceil);
        System.out.println("Just Smaller Path than " + criteria + " = " + p.floorPath + "@" + p.floor);
        System.out.println(k + "th largest path = " + pq.peek().psf + "@" + pq.peek().wsf);
    }
}
