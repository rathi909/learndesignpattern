package leetcode;

import java.util.*;

public class ShortestPathBinaryMatrix {
    
    // Directions: 8 possible moves (up, down, left, right, diagonals)
    private static final int[][] dirs = {
        {1,0}, {-1,0}, {0,1}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}
    };

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        // Step 1: Check if start or end is blocked
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1; // no path possible
        }

        // Step 2: BFS setup
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][n];

        // Start at (0,0) with distance = 1
        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        // Step 3: BFS loop
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], dist = cur[2];

            // Step 4: If we reached the goal, return distance
            if (r == n-1 && c == n-1) {
                return dist;
            }

            // Step 5: Explore all 8 directions
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n 
                    && !visited[nr][nc] && grid[nr][nc] == 0) {
                    
                    visited[nr][nc] = true; // mark visited
                    q.offer(new int[]{nr, nc, dist + 1}); // add to queue
                }
            }
        }

        // Step 6: If BFS finishes without reaching end, no path
        return -1;
    }

    // Driver code to test
    public static void main(String[] args) {
        ShortestPathBinaryMatrix solver = new ShortestPathBinaryMatrix();

        int[][] grid = {
            {0, 1, 0},
            {0, 0, 0},
            {1, 0, 0}
        };

        int result = solver.shortestPathBinaryMatrix(grid);
        System.out.println("Shortest Path Length = " + result);
    }
}