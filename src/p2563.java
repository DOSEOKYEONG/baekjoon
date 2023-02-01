import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2563 {
    // https://www.acmicpc.net/problem/2563
    // 색종이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[101][101];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = 0;
            }
        }

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    arr[x + j][y + k] = 1;
                }
            }
        }

        int total = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == 1){
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
