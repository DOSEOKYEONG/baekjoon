import java.io.*;

public class p10250 {
    // https://www.acmicpc.net/problem/10250
    // ACM 호텔

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] resultArr = new String[count];

        for (int i = 0; i < count; i++) {
            String[] hwn = br.readLine().split(" ");
            int h = Integer.parseInt(hwn[0]);
            int w = Integer.parseInt(hwn[1]);
            int n = Integer.parseInt(hwn[2]);
            String first;
            String last;
            if (n % h == 0) {
                first = "" + h;
                if (n / h < 10) {
                    last = "0" + (n / h);
                } else {
                    last = "" + (n / h);
                }
            } else {
                first = "" + (n % h);
                if (((n / h) + 1) < 10) {
                    last = "0" + ((n / h) + 1);
                } else {
                    last = "" + ((n / h) + 1);
                }
            }

            resultArr[i] = first + last;
        }

        for (int j = 0; j < resultArr.length; j++) {
            System.out.println(resultArr[j]);
        }
    }
}
