package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class UnreachableWareHouse {


    public static void main(String[] args) {

        int n = 6; // number of warehouses
        List<Integer> warehouse_from = Arrays.asList(1, 2, 5, 4, 5);
        List<Integer> warehouse_to = Arrays.asList(2, 3, 4, 6, 6);

        int result = minimumUnreachableWarehouses(n, warehouse_from, warehouse_to);
        System.out.println("Minimum unreachable warehouses: " + result);
    }

    public static int minimumUnreachableWarehouses(int n,List<Integer> from,List<Integer> to){
        int minieWarehouses =0;
        List<List<Integer>> graph =  new ArrayList<>();
        for (int i=0; i<=n;i++)
        {
            graph.add(new ArrayList<>());
        }

        //Graph is built
        for(int i=0;i<from.size();i++)
        {
            int fr = from.get(i);
            int t  = to.get(i);
            graph.get(fr).add(t);
            graph.get(t).add(fr);
        }

        boolean[] visited = new boolean[n+1];
        Stack<int[]> stack = new Stack<>();
        for(int i=1;i<n;i++)
        {
            if(!visited[i])
        {
            boolean hasCycle = false;
            int size =0;
            stack.push(new int[]{i,-1});
            visited[i] = true;
            while(!stack.isEmpty()){
                int[] pop = stack.pop();
                int node = pop[0];
                int parent = pop[1];
                size++;
                for(int neighbour: graph.get(node)){
                    if(!visited[neighbour])
                    {
                        visited[neighbour] = true;
                        stack.push(new int[]{neighbour,node});

                    }
                    else if (neighbour !=parent){
                        hasCycle = true;
                    }
                }
            }
            if(size ==1 ||
                    !hasCycle){
                minieWarehouses++;
            }

            }}
        return minieWarehouses;
    }};






