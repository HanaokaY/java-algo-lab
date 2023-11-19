package bfs;

import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        List<List<Integer>> graph = Arrays.asList(
            Arrays.asList(2,3),
            Arrays.asList(1,4,5),
            Arrays.asList(1,6),
            Arrays.asList(2),
            Arrays.asList(2),
            Arrays.asList(3)
        );

        bfs(graph, 1);
    }

    private static void bfs(List<List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println((current + 1) + " ");

            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
    

}
