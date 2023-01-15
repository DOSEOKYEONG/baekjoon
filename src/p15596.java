public class p15596 {
    // https://www.acmicpc.net/problem/15596
    // 정수 N개의 합

    public long sum(int[] a) {
        long total = 0;

        for (int num : a) {
            total += num;
        }

        return total;
    }
}
