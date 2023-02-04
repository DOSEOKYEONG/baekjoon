import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10870 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[21];
        arr[0] = 0;
        arr[1] = 1;

        fibonacci(2, n);
    }

    public static void fibonacci(int start, int n){
        if (n < 2){
            System.out.println(arr[n]);
            return;
        }

        arr[start] = arr[start -2] + arr[start - 1];
        if (start == n){
            System.out.println(arr[n]);
            return;
        }
        fibonacci(start + 1, n);
    }
}
