import java.math.BigInteger;
import java.util.Scanner;

public class b10757 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger A = new BigInteger(scan.next());
        BigInteger B = new BigInteger(scan.next());

        A = A.add(B);

        System.out.println(A.toString());
    }
}
