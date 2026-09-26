package leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadderProblem {

   static class Node{
       int node;
       int distance;
       Node(int node,int distance){
           this.node = node;
           this.distance = distance;
       }
   }

   public static int minDiceThrows(int n,int[] board){

       boolean[] visited = new boolean[n];
       Queue<Node> queue = new LinkedList<>();
       queue.add(new Node(0,0));
       visited[0] =true;
       while(!queue.isEmpty())
       {
           Node node = queue.poll();
           int v = node.node;
           if(v == n-1){
               return node.distance;
           }
           for (int i=1;i<=6 && v + i < n;i++){
               int next = i+ v;
               if(!visited[next]){
                   visited[next] = true;
                   queue.add(new Node(board[next],node.distance+1));
               }
           }

       }
      return  -1;


   }

    public static void main(String[] args) {
        int n=30;
        int[] board = new int[n];
        for(int i=1;i<n;i++)
        {
            board[i] = i;
        }

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

        System.out.println("Minimum dice throws required: " + minDiceThrows(n, board));


    }
}
