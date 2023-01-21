import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10809 {
    // https://www.acmicpc.net/problem/10809
    // 알파벳 찾기

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String str = bufferedReader.readLine();

        for (int j = 0; j < str.length(); j++) {
            char a = str.charAt(j);

            if (arr[a - 'a'] == -1) {
                arr[a - 'a'] = j;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
