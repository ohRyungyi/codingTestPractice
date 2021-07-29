import java.util.Scanner;

public class b1550 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        int order = 0;
        long result = 0;
        for ( int i=input.length()-1 ; i>=0 ; i-- ) {
            char c = input.charAt(i);
            int data = 0;
            if ( c >='A' && c<='F' ){
                data = c-'A'+10;
            }
            else {
                data = c-'0';
            }
            result += data*Math.pow(16, order);
            order+=1;
        }

        System.out.println(result);
    }
}
