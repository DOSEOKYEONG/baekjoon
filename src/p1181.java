import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class p1181 {
    // https://www.acmicpc.net/problem/1181
    // 단어 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    for (int j = 0; j < o1.length(); j++) {
                        char q = o1.charAt(j);
                        char w = o2.charAt(j);
                        if (q > w){
                            return 1;
                        } else if (q < w) {
                            return -1;
                        }
                    }
                    return 0;
                }
            }
        });

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

    }
}
