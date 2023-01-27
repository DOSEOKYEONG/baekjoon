import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p9020 {
    // https://www.acmicpc.net/problem/9020
    // 골드바흐의 추측

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            check(num);
        }
    }

    public static void check(int n) {
        ArrayList<Boolean> arrayList = new ArrayList<>(n + 1);
        arrayList.add(false);
        arrayList.add(false);

        for (int i =2; i <= n; i++){
            arrayList.add(i, true);
        }

        int end = (int) Math.sqrt(n);
        for(int i=2; i <= end; i++){
            if(arrayList.get(i)){
                for (int j = 2; i * j <= n; j++){
                    arrayList.set(i * j, false);
                }
            }
        }

        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 2; i <= arrayList.size() / 2; i++){
            if (arrayList.get(i)){
                if (arrayList.get(n - i)){
                    stringArrayList.add(i + " " + (n - i));
                }
            }
        }
        System.out.println(stringArrayList.get(stringArrayList.size() - 1));
    }
}
