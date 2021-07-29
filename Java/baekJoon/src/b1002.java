import java.util.Scanner;

public class b1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for ( int i=0 ; i<T ; i++ ) {
            int x1, y1, r1, x2, y2, r2;
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            r1 = scan.nextInt();

            x2 = scan.nextInt();
            y2 = scan.nextInt();
            r2 = scan.nextInt();

            double dist = Math.sqrt( Math.pow((double) x1-x2, 2.0)+ Math.pow((double) y1-y2, 2.0));
            // System.out.println(dist);

            if (x1 == x2 && y1 == y2) {
                if ( r1 == r2) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if ( dist > (double) r1+r2){
                System.out.println(0);
            }
            else if ( dist == (double) r1+r2 ) {
                System.out.println(1);
            }
            else if (dist < (double) r1 + r2 && dist > (int) Math.abs(r1 - r2)) {
                System.out.println(2);
            }
            else if (Math.abs(r1-r2) == (int) dist) {
                System.out.println(1);
            }
            else if (Math.abs(r1-r2) > (int) dist) {
                System.out.println(0);
            }
        }
    }    
}
