import java.io.*;
public class p2738 {
    // https://www.acmicpc.net/problem/2738
    // 행렬 덧셈
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);
        int[][] numArr1 = new int[N][M];
        int[][] numArr2 = new int[N][M];
        for(int i = 0; i < N; i++){
            String[] brArr = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                numArr1[i][j] = Integer.parseInt(brArr[j]);
            }
        }

        for(int q = 0; q < N; q++){
            String[] brArr = br.readLine().split(" ");
            for(int w = 0; w < M; w++){
                numArr2[q][w] = Integer.parseInt(brArr[w]);
            }
        }
        int[][] resultArr = new int[N][M];
        for(int a = 0; a < N; a++){
            for(int b = 0; b < M; b++){
                resultArr[a][b] = numArr1[a][b] + numArr2[a][b];
            }
        }

        for(int z = 0; z < N; z++){
            for(int x = 0; x < M; x++){
                System.out.print(resultArr[z][x] + " ");
            }
            System.out.print("\n");
        }
    }
}
