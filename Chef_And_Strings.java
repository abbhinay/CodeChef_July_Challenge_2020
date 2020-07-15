import java.util.Scanner;

class Chef_And_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            int i = 0;
            long count = 0;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            for (i = 0; i < n - 1; i++) {
                count += Math.abs(arr[i] - arr[i + 1]) - 1;
            }
            System.out.println(count);
        }
    }
}