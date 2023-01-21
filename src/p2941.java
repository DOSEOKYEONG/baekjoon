import java.io.*;
public class p2941 {
    // https://www.acmicpc.net/problem/2941
    // 크로아티아 알파벳

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < arr.length; i++) {
            if (str.contains(arr[i])) {
                str = str.replace(arr[i], "@");
            }
        }
        System.out.println(str.length());
    }
}
