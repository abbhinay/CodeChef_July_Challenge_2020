import java.io.*;

class Chef_And_Card_Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
            int n = Integer.parseInt(br.readLine());
            int count1 = 0;
            int count2 = 0;
            for (int y = 0; y < n; y++) {
                String[] str = br.readLine().split(" ");
                long no1 = Long.parseLong(str[0]);
                long no2 = Long.parseLong(str[1]);
                no1 = helper(no1);
                no2 = helper(no2);
                if (no1 > no2)
                    count1++;
                else if (no1 < no2)
                    count2++;
                else {
                    count1++;
                    count2++;
                }
            }
            if (count1 > count2) {
                System.out.println(0 + " " + count1);
            } else if (count1 < count2) {
                System.out.println(1 + " " + count2);
            } else {
                System.out.println(2 + " " + count2);
            }
        }
    }

    public static int helper(long no) {
        int sum = 0;
        while (no > 0) {
            sum += no % 10;
            no = no / 10;
        }
        return sum;
    }
}