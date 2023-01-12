import java.util.Scanner;

public class p10807 {
    // https://www.acmicpc.net/problem/10807
    // 개수 세기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int cnt = 0;

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        for(int j = 0; j < array.length; j++) {
            if (n == array[j]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
