package powerpackage;

public class PowerFinder {
    public static int calculatePower(int base, int exponent) {
        int ans = 1;
        while (exponent != 0) {
            ans *= base;
            --exponent;
        }
        return ans;
    }
}
