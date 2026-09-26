package leetcode;

import java.util.*;

public class DFSExample {

    public static void dfs(Map<String, List<String>> graph, String start) {

        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            String node = stack.pop();

            if (!visited.contains(node)) {

                System.out.print(node + " ");
                visited.add(node);

                List<String> neighbors = graph.get(node);

                // push neighbors in reverse order
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    stack.push(neighbors.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {

        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", new ArrayList<>());
        graph.put("E", Arrays.asList("G"));
        graph.put("F", new ArrayList<>());
        graph.put("G", new ArrayList<>());

        dfs(graph, "A");
    }
}