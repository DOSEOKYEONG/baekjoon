import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2750 {
    // https://www.acmicpc.net/problem/2750
    // 수 정렬하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        for(int i = 0; i < a; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
