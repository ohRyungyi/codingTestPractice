import java.util.Scanner;

public class b1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int mW = Math.min(Math.abs(0-x),Math.abs(w-x));
        int mH = Math.min(Math.abs(0-y), Math.abs(h-y));

        System.out.println(Math.min(mW, mH));
    }
}
