import java.io.*;
public class p2908 {
    // https://www.acmicpc.net/problem/2908
    // 상수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        String str = "";
        int num1;
        for(int i = strArr[0].length() - 1; i >= 0; i--){
            str += strArr[0].charAt(i);
        }
        num1 = Integer.parseInt(str);
        str = "";
        int num2;
        for(int j = strArr[1].length() - 1; j >= 0; j--){
            str += strArr[1].charAt(j);
        }
        num2 = Integer.parseInt(str);
        System.out.println(Math.max(num1, num2));
    }
}
