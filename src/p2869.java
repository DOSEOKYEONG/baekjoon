import java.io.*;
public class p2869{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        double A = Integer.parseInt(str[0]);
        double B = Integer.parseInt(str[1]);
        double V = Integer.parseInt(str[2]);

        int day = (int) Math.ceil((V - B) / (A - B));

        System.out.println(day);
    }
}