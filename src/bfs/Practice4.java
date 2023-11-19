package bfs;
import java.util.*;
public class Practice4 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                numbersList.add(i);
            }
        }

        for (int num : numbersList) {
            System.out.println(num);
        }
    }
}
