import java.util.*;

public class beautifull_matrix {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int r = 0, c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] == 1) {
                    r = i;
                    c = j;
                }
            }
        }
        int v1 = Math.abs(2 - r);
        int v2 = Math.abs(2 - c);
        System.out.println(v1 + v2);

    }

}
