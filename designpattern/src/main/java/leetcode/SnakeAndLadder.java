package leetcode;

import java.util.*;

class SnakeAndLadder {

    static class Node {
        int vertex;
        int distance;
        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public static int minDiceThrows(int N, int[] board) {
        boolean[] visited = new boolean[N];
        Queue<Node> queue = new LinkedList<>();
        
        visited[0] = true;
        queue.add(new Node(0, 0));
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int v = node.vertex;
            
            if (v == N - 1) return node.distance;

            for (int i = 1; i <= 6 && v + i < N; i++) {
                int next = v + i;
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(new Node(board[next], node.distance + 1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 30;
        int[] board = new int[N];
        for (int i = 0; i < N; i++) board[i] = i;

        // Ladders
        board[2] = 21;
        board[4] = 7;
        board[10] = 25;
        board[19] = 28;

        // Snakes
        board[26] = 0;
        board[20] = 8;
        board[16] = 3;
        board[18] = 6;

        System.out.println("Minimum dice throws required: " + minDiceThrows(N, board));
    }
}