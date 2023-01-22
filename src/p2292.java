import java.io.*;
public class p2292{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;

        int total = 2;

        if (num == 1) {
            System.out.println(1);
        } else {
            while(total <= num){
                total += 6 * (count);
                count++;
            }
            System.out.println(count);
        }
    }
}