package bfs;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 8; i++) { // 頂点の数に対応するため7まで
            graph.add(new ArrayList<>());
        }

        System.out.println("エッジリストを入力してください（各エッジは2つの整数で、スペースで区切られています）:");
        for (int i = 0; i < 7; i++) {
            int a = scanner.nextInt() - 1; // 頂点のインデックス調整（1から始まる頂点を0から始まるインデックスに変換）
            int b = scanner.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a); // 双方向の接続
        }

        // 幅優先探索の実行
        bfs(graph, 0);
        scanner.close();
    }

    private static void bfs(List<List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print((current + 1) + " ");

            // 隣接する頂点をキューに追加
            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
