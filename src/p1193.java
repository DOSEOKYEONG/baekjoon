import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1193 {
    // https://www.acmicpc.net/problem/1193
    // 분수찾기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int x = 1;
        int y = 2;

        int p = 0; // 0 = 내려감, 1 = 올라감, 3 = 오른쪽, 4 = 아래
        int count = 2;
        int i = 0;

        if (num == 1) {
            System.out.println(1 + "/" + 1);
        } else {
            while (count < num) {
                if (p == 0) {
                    x++;
                    y--;
                    count++;
                    if (y == 1) {
                        p = 4;
                    }
                } else if (p == 4) {
                    x++;
                    count++;
                    p = 1;
                } else if (p == 1) {
                    x--;
                    y++;
                    count++;
                    if (x == 1) {
                        p =3;
                    }
                } else if (p == 3) {
                    y++;
                    count++;
                    p = 0;
                }
            }
            System.out.println(x + "/" + y);
        }
    }
}
