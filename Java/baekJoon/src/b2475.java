import java.util.Scanner;

public class b2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

        int sum = 0;

        for (int i=0 ; i<5 ; i++ ) {
            arr[i] = scan.nextInt();
            arr[i] *= arr[i];

            sum+=arr[i];
        }

        System.out.println(sum%10);
    }
}
