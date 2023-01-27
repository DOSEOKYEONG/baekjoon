import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2581 {
    // https://www.acmicpc.net/problem/2581
    // 소수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(; start <= end; start++){
            if(check(start)){
                arrayList.add(start);
            }
        }
        if(arrayList.isEmpty()){
            System.out.println(-1);
        } else{
            int total = 0;
            for(int num : arrayList){
                total += num;
            }
            System.out.println(total);
            System.out.println(arrayList.get(0));
        }
    }

    public static boolean check(int n){
        int end = (int)Math.sqrt(n);
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= end; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
