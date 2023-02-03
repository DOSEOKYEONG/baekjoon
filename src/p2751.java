import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p2751 {
    // https://www.acmicpc.net/problem/2751
    // 수 정렬하기 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            arrayList.add(num);
        }

        Collections.sort(arrayList);

        for (int a : arrayList) {
            sb.append(a).append('\n');
        }

        System.out.println(sb);
    }
}
