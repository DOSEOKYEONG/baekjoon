import java.io.*;
public class p1929{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);

        for(; start <= end; start++){
            if(check(start)){
                System.out.println(start);
            }
        }
    }

    public static boolean check(int n){
        if(n == 1){
            return false;
        }
        int end = (int)Math.sqrt(n);
        for(int i = 2; i <= end; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}