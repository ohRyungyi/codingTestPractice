import java.math.BigInteger;
import java.util.Scanner;

public class b1271 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger A = new BigInteger(scan.next());
        BigInteger B = new BigInteger(scan.next());

        BigInteger a = A.divide(B);
        System.out.println(a);

        BigInteger b = B.multiply(a);
        b = A.subtract(b);
        System.out.println(b);
    }
}
