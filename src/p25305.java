import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p25305 {
    // https://www.acmicpc.net/problem/25305
    // 커트라인

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int size = Integer.parseInt(str[0]);
        int cut = Integer.parseInt(str[1]);

        Integer[] arr = new Integer[size];

        String[] numList = br.readLine().split(" ");
        for (int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(numList[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[cut - 1]);
    }
}
