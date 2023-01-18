import java.util.*;
public class p1065 {
    // https://www.acmicpc.net/problem/1065
    // 한수

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(hansu(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean hansu(int num){
        if(num < 100){
            return true;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        while(num != 0){
            arrayList.add(num % 10);
            num = num / 10;
        }
        int gap = arrayList.get(1) - arrayList.get(0);
        for(int i = 1; i < arrayList.size(); i++){
            if(arrayList.get(i) - arrayList.get(i - 1) != gap){
                return false;
            }
        }
        return true;
    }
}
