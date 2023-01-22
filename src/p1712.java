import java.io.*;

public class p1712 {
    // https://www.acmicpc.net/problem/1712
    // 손익분기점

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int count;

        if (c - b <= 0) {
            count = -1;
        } else {
            count = (a / (c - b)) + 1;
        }

        System.out.println(count);
    }
}
