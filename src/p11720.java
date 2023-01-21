import java.util.*;
public class p11720 {
    // https://www.acmicpc.net/submit/11720
    // 숫자의 합

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        String str = sc.next();

        int total = 0;

        for(int i = 0; i < count; i++){
            total += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(total);
    }
}
