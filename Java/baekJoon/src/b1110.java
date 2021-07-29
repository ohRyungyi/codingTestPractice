import java.util.Scanner;

public class b1110 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(cycle(num, -1));

    }   

    public static int cycle(int num, int nStandard) {
        int[] mid = new int[2];

        if ( num == nStandard) {
            return 0;
        }
        else if ( nStandard == -1 ){
            mid[0] = num/10;
            mid[1] = num%10;

            int standard = mid[0]+mid[1];
            nStandard = mid[1]*10+(standard%10);
        }
        else {
            mid[0] = nStandard/10;
            mid[1] = nStandard%10;

            int standard = mid[0]+mid[1];
            nStandard = mid[1]*10+(standard%10);
        }
        

        return 1+cycle(num, nStandard);
    }
}
