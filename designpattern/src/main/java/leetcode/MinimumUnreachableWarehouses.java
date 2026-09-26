package leetcode;

import java.util.*;

/**
 * Problem: Minimum Unreachable Warehouses
 *
 * You are given n warehouses (numbered 1 to n) and a list of bidirectional roads connecting them.
 * You can convert each road into a one-way road in any direction.
 * A warehouse is "unreachable" if no road points to it.
 *
 * Goal: Minimize the number of unreachable warehouses by choosing directions optimally.
 *
 * Example:
 * n = 6
 * roads = [[1,2],[2,3],[5,4],[4,6],[5,6]]
 *
 * Graph:
 * Component 1: 1-2-3 (chain) -> min unreachable = 1
 * Component 2: 4-5-6 (triangle/cycle) -> min unreachable = 0
 *
 * Expected output: 1
 */

public class MinimumUnreachableWarehouses {

    public static void main(String[] args) {

        int n = 6; // number of warehouses
        List<Integer> warehouse_from = Arrays.asList(1, 2, 5, 4, 5);
        List<Integer> warehouse_to = Arrays.asList(2, 3, 4, 6, 6);

        int result = minimumUnreachableWarehouses(n, warehouse_from, warehouse_to);
        System.out.println("Minimum unreachable warehouses: " + result);
    }

    public static int minimumUnreachableWarehouses(int n,
                                                    List<Integer> warehouse_from,
                                                    List<Integer> warehouse_to) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < warehouse_from.size(); i++) {
            int u = warehouse_from.get(i);
            int v = warehouse_to.get(i);
            graph.get(u).add(v);
            graph.get(v).add(u); // undirected graph
        }

        boolean[] visited = new boolean[n + 1];
        int unreachable = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                boolean[] hasCycle = new boolean[1];
                int size = dfsCycle(i, -1, graph, visited, hasCycle);

                if (size == 1 || !hasCycle[0]) {
                    // isolated node or chain → 1 unreachable
                    unreachable++;
                }
                // if cycle → 0 unreachable
            }
        }

        return unreachable;
    }

    private static int dfsCycle(int node, int parent, List<List<Integer>> graph, boolean[] visited, boolean[] hasCycle) {
        visited[node] = true;
        int count = 1;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                count += dfsCycle(neighbor, node, graph, visited, hasCycle);
            } else if (neighbor != parent) {
                hasCycle[0] = true; // cycle detected
            }
        }
        return count;
    }
}