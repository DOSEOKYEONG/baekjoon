import java.io.*;
import java.util.Arrays;

public class p2839{
    // https://www.acmicpc.net/problem/2839
    // 설탕 배달
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num < 5){
            if (num == 3){
                System.out.println(1);
            }else {
                System.out.println(-1);
            }
            return;
        }
        int arr[] = new int[num + 1];
        Arrays.fill(arr, 9999);
        arr[3] = 1;
        arr[5] = 1;
        for (int i = 6; i < arr.length; i++){
            arr[i] = Math.min(arr[i - 3] + 1, arr[i - 5] + 1);
        }
        if (arr[num] > 9999){
            System.out.println(-1);
        }else {
            System.out.println(arr[num]);
        }
    }
}