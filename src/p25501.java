import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25501 {
    // https://www.acmicpc.net/problem/25501
    // 재귀의 귀재

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            isPalindrome(str);
        }
        System.out.println(sb);
    }
    public static void recursion(String s, int l, int r, int num){
        if(l >= r){
            sb.append(1 + " " + num).append('\n');
            return;
        }
        else if(s.charAt(l) != s.charAt(r)){
            sb.append(0 + " " + num).append('\n');
            return;
        }
        else {
            recursion(s, l+1, r-1, num + 1);
        }
    }
    public static void isPalindrome(String s){
        recursion(s, 0, s.length()-1, 1);
    }
}
