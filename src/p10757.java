import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p10757 {
    // https://www.acmicpc.net/problem/10757
    // 큰 수 A+B

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");

        BigInteger a = new BigInteger(strArr[0]);
        BigInteger b = new BigInteger(strArr[1]);

        System.out.println(a.add(b));
    }
}
