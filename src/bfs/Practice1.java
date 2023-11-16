package bfs;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> graph = createGraph(scanner);
        performBFS(graph);
        scanner.close();
    }

    private static List<List<Integer>> createGraph(Scanner scanner) {
        System.out.println("頂点数と辺数を入力してください：");
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= vertices; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("各辺の接続情報を入力してください：");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }

    private static void performBFS(List<List<Integer>> graph) {
        System.out.println("幅優先探索を開始します。");
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println("訪問: " + current);

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    System.out.println(neighbor + " をキューに追加しました。");
                }
            }
        }
    }
}
