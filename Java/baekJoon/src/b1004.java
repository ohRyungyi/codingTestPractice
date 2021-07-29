import java.util.Scanner;

public class b1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        num number = new num();
        for ( int i=0 ; i<N ; i++ ) {
            int n = Integer.parseInt(scan.nextLine());
            number.num_0 = 0;
            number.num_1 = 0;

            fibonacci(n, number);

            System.out.println(number.num_0+" "+number.num_1);
        }
    }

    public static class num {
        int num_0;
        int num_1;

        public num() {
            num_0 = 0;
            num_1 = 0;
        }
    }

    public static int fibonacci(int n, num s) {
        if ( n==0 ) {
            s.num_0+=1;
            return 0;
        }
        else if (n==1) {
            s.num_1+=1;
            return 1;
        }
        else {
            return fibonacci(n-1, s)+fibonacci(n-2, s);
        }
    }
}
