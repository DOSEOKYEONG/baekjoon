import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class p1316 {
    // https://www.acmicpc.net/problem/1316
    // 그룹 단어 체커

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int num = 0;

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            if (checkGroupWord(str)) {
                num++;
            }
        }

        System.out.println(num);
    }

    public static boolean checkGroupWord(String str) {
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        char num = '1';
        for (Character c : set) {
            str = str.replace(c, num);
            num++;
        }

        char a = '0';
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != a) {
                a++;
            }
            if (str.charAt(j) < a) {
                return false;
            }
        }
        return true;
    }
}
