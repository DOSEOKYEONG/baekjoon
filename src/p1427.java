import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p1427 {
    // https://www.acmicpc.net/problem/1427
    // 소트인사이드

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Character> arrayList = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            arrayList.add(str.charAt(i));
        }
        Collections.sort(arrayList, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < arrayList.size(); j++){
            sb.append(arrayList.get(j));
        }

        System.out.println(sb);
    }
}
