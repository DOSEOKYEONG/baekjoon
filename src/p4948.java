import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4948 {
    // https://www.acmicpc.net/problem/4948
    // 베르트랑 공준

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            int count = 0;
            for (int i = num + 1; i <= (2 * num); i++) {
                if (check(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    public static boolean check(int n) {
        if (n == 1) {
            return false;
        }
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
