import java.util.*;

public class p5597 {
    // https://www.acmicpc.net/problem/5597
    // 과제 안 내신 분..?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = scanner.nextInt();
            array[num - 1] = num;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                System.out.println(j + 1);
            }
        }
    }
}
