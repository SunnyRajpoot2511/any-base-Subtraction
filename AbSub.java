import java.util.*;

public class AbSub {

    public static Scanner scn = new Scanner(System.in);

    public static int diff(int b, int n1, int n2) {
        int ans = 0;
        int pow = 1;
        int borrow = 0;

        while (n2 != 0) {
            int sub = borrow + n2 % 10 - n1 % 10;
            n2 /= 10;
            n1 /= 10;

            if (sub < 0) {
                sub += b;
                borrow = -1;
            }
            else {
                borrow = 0;
            }

            ans += sub * pow;
            pow *= 10;
        }
        return ans;       
    }

    public static void main(String[] args) {
        int b = scn.nextInt();
        int difference = diff(scn.nextInt(), scn.nextInt(), b);
        System.out.print(difference);
    }

}
