import java.util.Scanner;

public class b2845 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int P = scan.nextInt();

        long tot = (long) L*P;

        for ( int i=0 ; i<5 ; i++ ) {
            long data= scan.nextLong();
            System.out.print(data-tot+" ");
        }
    }
}
