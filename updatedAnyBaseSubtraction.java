import java.util.*;

public class BTD {

    public static Scanner scn = new Scanner(System.in);

    public static int decReturn(int n) {
        int ans = 0;
        int pow = 1;

        while (n != 0) {
            int r = n % 10;
            n = n / 10;

            ans += r * pow;
            pow = pow * 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = decReturn(scn.nextInt());
        System.out.print(n);
    }
}





