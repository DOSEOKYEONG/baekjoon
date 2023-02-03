import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p11651 {
    // https://www.acmicpc.net/problem/11651
    // 좌표 정렬하기 2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            arr[i][0] = a;
            arr[i][1] = b;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return 1;
                } else if (o1[1] < o2[1]) {
                    return -1;
                } else {
                    if (o1[0] > o2[0]) {
                        return 1;
                    } else if (o1[0] < o2[0]) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j][0] + " " + arr[j][1]);
        }
    }
}
