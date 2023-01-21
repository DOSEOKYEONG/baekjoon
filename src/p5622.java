import java.io.*;
public class p5622 {
    // https://www.acmicpc.net/problem/5622
    // 다이얼

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int total = 0;

        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i) - 'A';
            if(c >= 0 && c <= 2){
                total += 3;
            } else if(c >= 3 && c <= 5){
                total += 4;
            } else if(c >= 6 && c <= 8){
                total += 5;
            } else if(c >= 9 && c <= 11){
                total += 6;
            } else if(c >= 12 && c <= 14){
                total += 7;
            } else if(c >= 15 && c <= 18){
                total += 8;
            } else if(c >= 19 && c <= 21){
                total += 9;
            } else if(c >= 22 && c <= 25){
                total += 10;
            }
        }

        System.out.println(total);
    }
}
