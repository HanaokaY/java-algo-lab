package bfs;
import java.util.*;

public class Practice6 {
    public static void main(String[] args) {
        processInput(new Scanner(System.in));
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

    private static void processInput(Scanner scanner) {
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
}
