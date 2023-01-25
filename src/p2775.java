import java.io.*;
public class p2775 {
    // https://www.acmicpc.net/problem/2775
    // 부녀회장이 될테야

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(fun(k, n));
        }
    }

    public static int fun(int k, int n) {
        // k = 1, n = 3
        int[][] arr = new int[k + 1][n];
        // 0층 초기화
        for (int i = 0; i < n; i ++){
            arr[0][i] = i + 1;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++){
                arr[i][j] = cal(arr, i, j);
            }
        }

        return arr[k][n-1];
    }

    public static int cal(int[][] numArr, int a, int b){
        int total = 0;
        if (b == 0) {
            return 1;
        } else {
            for (int i = 0; i <= b; i++){
                total += numArr[a - 1][i];
            }
            return total;
        }
    }
}
