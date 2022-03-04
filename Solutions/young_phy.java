import java.util.*;

public class young_phy {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        while (t != 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            sum1 += x;
            sum2 += y;
            sum3 += z;
            t--;
        }
        if (sum1 == 0 && sum2 == 0 && sum3 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
