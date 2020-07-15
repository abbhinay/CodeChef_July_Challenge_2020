import java.io.*;
import java.util.*;

class Missing_A_Point {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
            long n = Long.parseLong(br.readLine());
            long i = 0;
            HashMap<Long, Integer> rowMap = new HashMap<>();
            HashMap<Long, Integer> colMap = new HashMap<>();
            for (i = 0; i < (4 * n) - 1; i++) {
                String[] arr = br.readLine().split(" ");
                long row = Long.parseLong(arr[0]);
                long col = Long.parseLong(arr[1]);
                if (!rowMap.containsKey(row)) {
                    rowMap.put(row, 1);
                } else {
                    rowMap.put(row, rowMap.get(row) + 1);
                }

                if (!colMap.containsKey(col)) {
                    colMap.put(col, 1);
                } else {
                    colMap.put(col, colMap.get(col) + 1);
                }
            }
            long row = 0;
            long col = 0;
            for (Map.Entry m : rowMap.entrySet()) {
                if ((int) m.getValue() % 2 != 0) {
                    row = (long) m.getKey();
                    break;
                }
            }
            for (Map.Entry m : colMap.entrySet()) {
                if ((int) m.getValue() % 2 != 0) {
                    col = (long) m.getKey();
                    break;
                }
            }
            System.out.println(row + " " + col);
        }
    }
}