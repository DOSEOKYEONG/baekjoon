import java.io.*;
public class p1157 {
    // https://www.acmicpc.net/problem/1157
    // 단어공부

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toLowerCase();

        int[] intArr = new int[26];

        for(int i = 0; i < intArr.length; i++){
            intArr[i] = 0;
        }

        for(int j = 0; j < str.length(); j++){
            char a = str.charAt(j);
            intArr[a - 'a']++;
        }

        String result = "";
        int max = -1;

        for (int k = 0; k < intArr.length; k++) {
            if (max < intArr[k]) {
                max = intArr[k];
                char ch = (char) ('a' + k);
                result = String.valueOf(ch).toUpperCase();
            } else if (max == intArr[k]) {
                result = "?";
            }
        }

        System.out.println(result);
    }
}
