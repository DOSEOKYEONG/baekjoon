import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p2108 {
    // https://www.acmicpc.net/problem/2108
    // 통계학

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int size = Integer.parseInt(br.readLine());
        double total = 0;

        for (int i = 0; i < size; i++){
            int num = Integer.parseInt(br.readLine());
            total += num;
            arrayList.add(num);

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Collections.sort(arrayList);

        int avg = (int) Math.round(total / size);
        int middle = arrayList.get(size / 2);

        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        int range = max - min;

        int count = 0;
        for (int n : map.values()) {
            count = Math.max(count, n);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int a : map.keySet()) {
            if (map.get(a) == count) {
                list.add(a);
            }
        }

        Collections.sort(list);
        int most = 0;

        if (list.size() > 1) {
            most = list.get(1);
        } else {
            most = list.get(0);
        }

        System.out.println(avg);
        System.out.println(middle);
        System.out.println(most);
        System.out.println(range);
    }
}
