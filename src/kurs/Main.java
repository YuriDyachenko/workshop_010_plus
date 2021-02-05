package kurs;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        for (int i = 2; i < 17; i++) {
            System.out.printf("%d (%d) = %s\n", n, i, intToBaseString(n, i));
        }
    }

    public static String intToBaseString(int n, int base) {
        if (base > 16 || base < 2) {
            return "Wrong base!";
        }
        String digits = "0123456789ABCDEF";
        StringBuilder sb = new StringBuilder();
        int rest = n;
        while (true) {
            if (rest < base) {
                sb.append(digits.charAt(rest));
                break;
            }
            int dig = rest % base;
            sb.append(digits.charAt(dig));
            rest /= base;
        }
        return sb.reverse().toString();
    }
}
