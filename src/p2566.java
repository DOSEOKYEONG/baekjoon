import java.io.*;
public class p2566 {
    // https://www.acmicpc.net/problem/2566
    // 최대값

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = -1;
        String position = "";
        for(int i = 0; i < 9; i++){
            String[] strArr = br.readLine().split(" ");
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    position = (i + 1) + " " + (j + 1);
                }
            }
        }

        System.out.println(max);
        System.out.println(position);

    }
}
