import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p11650 {
    // https://www.acmicpc.net/problem/11650
    // 좌표 정렬하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[][] arr = new int[a][2];

        for (int i = 0; i < a; i++) {
            String[] strArr = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(strArr[0]);
            arr[i][1] = Integer.parseInt(strArr[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] > o2[0]){
                    return 1;
                }
                else if (o1[0] < o2[0]){
                    return -1;
                } else {
                    if (o1[1] > o2[1]){
                        return 1;
                    }
                    else if (o1[1] < o2[1]){
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        for (int j = 0; j < a; j++) {
            System.out.println(arr[j][0] + " " + arr[j][1]);
        }
    }
}
