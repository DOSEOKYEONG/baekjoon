public class p4673 {
    // https://www.acmicpc.net/problem/4673
    // 셀프 넘버

    public static void main(String[] args) {
        boolean[] array = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int a = getNumber(i);
            if (a <= 10000) {
                array[a] = true;
            }
        }

        for (int j = 1; j <= 10000; j++) {
            if (array[j] == false) {
                System.out.println(j);
            }
        }
    }

    public static int getNumber(int num) {
        int result = 0 + num;

        while (num != 0) {
            result += num % 10;
            num = num / 10;
        }

        return result;
    }
}
