package bfs;
import java.util.*;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("整数の数を入力してください。");
        int num = scanner.nextInt();

        System.out.println("n個の整数を空白で区切って入力してください。");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("探索対象の値を入力してください。");
        int target = scanner.nextInt();

        printResult(numbers, target);
    }

    private static void printResult(List<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
