import java.util.*;

class Ada_King {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char[][] arr = new char[8][8];
        for (int z = 0; z < t; z++) {
            int no = sc.nextInt();
            int i = 0, j = 0, count = 0;
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    if (count < no) {
                        arr[i][j] = '.';
                        count++;
                    } else {
                        arr[i][j] = 'X';
                    }
                }
            }
            arr[0][0] = 'O';
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}