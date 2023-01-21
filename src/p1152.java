import java.io.*;
public class p1152 {
    // https://www.acmicpc.net/problem/1152
    // 단어의 개수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().strip();
        if (str.equals("")){
            System.out.println("0");
        }else {
            String[] arr = str.split(" ");

            System.out.println(arr.length);
        }
    }
}
