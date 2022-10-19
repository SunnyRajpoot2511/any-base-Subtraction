import java.util.*;

public class ATD {

    public static Scanner scn = new Scanner(System.in);

    public static int AbToDecReturn(int n, int b) {
        int ans = 0;
        int pow = 1;

        while (n != 0) {
            int r = n % 10;
            n = n / 10;

            ans += r * pow;
            pow = pow * b;
        }
        return ans;
    }

    public static void main(String[] args) {
        int dec = AbToDecReturn(scn.nextInt(), scn.nextInt());
        System.out.print(dec);
    }
}
