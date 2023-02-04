import java.io.*;
public class p10872 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fac(n, 1);
    }

    public static void fac(int end, int n){
        if(end == 0){
            System.out.println(n);
            return;
        }
        fac(end - 1, n * end);
    }
}
