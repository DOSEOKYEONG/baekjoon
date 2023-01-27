import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11653 {
    // https://www.acmicpc.net/problem/11653
    // 소인수분해

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while(num != 1){
            int p = check(num);
            System.out.println(p);
            num = num / p;
        }
    }

    public static int check(int n){
        int end = (int)Math.sqrt(n);
        if(n == 2 || n == 3 || n == 5 || n == 7){
            return n;
        }
        for(int i = 2; i <= end; i++){
            if(n % i ==0){
                return i;
            }
        }
        return n;
    }
}
