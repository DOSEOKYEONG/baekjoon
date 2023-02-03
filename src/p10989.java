import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p10989 {
    // https://www.acmicpc.net/problem/10989
    // 수 정렬하기 3

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);

        for (int a : arr) {
            sb.append(a).append('\n');
        }

        System.out.println(sb);
    }
}
