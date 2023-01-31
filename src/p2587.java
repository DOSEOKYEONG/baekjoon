import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p2587 {
    // https://www.acmicpc.net/problem/2587
    // 대표값2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            int a = Integer.parseInt(br.readLine());
            arrayList.add(a);
        }

        int total = 0;
        for(int j = 0; j < arrayList.size(); j++){
            total += arrayList.get(j);
        }
        int avg = total / arrayList.size();
        Collections.sort(arrayList);
        System.out.println(avg);
        System.out.println(arrayList.get(2));
    }
}
