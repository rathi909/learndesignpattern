package leetcode;

import java.util.*;

public class MinimumUnreachableWarehousesStack {

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

        // Build the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < warehouse_from.size(); i++) {
            int u = warehouse_from.get(i);
            int v = warehouse_to.get(i);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        int unreachable = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                // Use iterative DFS to explore component and detect cycle
                boolean hasCycle = false;
                int size = 0;

                Stack<int[]> stack = new Stack<>();
                stack.push(new int[]{i, -1}); // {node, parent}
                visited[i] = true;

                while (!stack.isEmpty()) {
                    int[] curr = stack.pop();
                    int node = curr[0];
                    int parent = curr[1];
                    size++;

                    for (int neighbor : graph.get(node)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            stack.push(new int[]{neighbor, node});
                        } else if (neighbor != parent) {
                            hasCycle = true; // cycle detected
                        }
                    }
                }

                // Determine unreachable based on component type
                if (size == 1 || !hasCycle) {
                    unreachable++; // isolated node or chain
                }
                // else cycle → 0 unreachable
            }
        }

        return unreachable;
    }
}