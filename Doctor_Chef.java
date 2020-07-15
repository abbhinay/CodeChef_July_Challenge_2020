import java.util.*;

class Doctor_Chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            long[] immune = new long[n];
            int i = 0, index = 0, count = 0;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            if (x >= arr[n - 1]) {
                count = n;
            } else if (arr[0] > x) {
                while (immune[n - 1] < arr[n - 1]) {
                    count++;
                    if (x >= arr[index]) {
                        immune[index] = arr[index];
                        x = 2 * arr[index];
                        index++;
                    } else {
                        immune[index] = x;
                        long increase = 2 * (arr[index] - x);
                        if (increase >= arr[index]) {
                            immune[index] = 0;
                        } else if (increase <= immune[index]) {
                            immune[index] = arr[index] - increase;
                        } else {
                            immune[index] = 0;
                        }
                        x = 2 * x;
                    }
                }
            } else {
                count--;
                index = n - 1;
                while (immune[0] < arr[0]) {
                    count++;
                    if (x >= arr[index]) {
                        immune[index] = arr[index];
                        x = 2 * arr[index];
                        index--;
                    } else {
                        immune[index] = x;
                        long increase = 2 * (arr[index] - x);
                        if (increase >= arr[index]) {
                            immune[index] = 0;
                        } else if (increase <= immune[index]) {
                            immune[index] = arr[index] - increase;
                        } else {
                            immune[index] = 0;
                        }
                        x = 2 * x;
                    }
                }
            }
            System.out.println(count);
        }
    }
}