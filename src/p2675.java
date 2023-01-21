import java.io.*;

public class p2675{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            int num = Integer.parseInt(line.split(" ")[0]);
            String str = line.split(" ")[1];

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print("\n");
        }
    }
}