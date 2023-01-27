import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1978 {
    // https://www.acmicpc.net/problem/1978
    // 소수 찾기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int count = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(arr[i]);
            if(check(num)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(int n){
        if(n == 1){
            return false;
        }
        int end = (int) Math.sqrt(n);
        for(int i = 2; i <= end; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
