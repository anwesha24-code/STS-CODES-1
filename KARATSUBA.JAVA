import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        String x = "12345678901234567890";
        String y = "98765432109876543210";

        BigInteger a = new BigInteger(x);
        BigInteger b = new BigInteger(y);

        BigInteger result = a.multiply(b);

        System.out.println(result);
    }
}
